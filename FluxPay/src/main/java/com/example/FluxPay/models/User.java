package com.example.FluxPay.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
public class User {


    @Id
    private Long Id;
    private Long clientId;
    private String name;
    private String email;
    private String passwordHash;
    private Role role;

    public Long getId() {return Id;}

    public void setId(Long Id) {this.Id = Id;}

    public Long getClientId() {return clientId;}

    public void setClientId(Long clientId) {this.clientId = clientId;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getPasswordHash() {return passwordHash;}

    public void setPasswordHash(String passwordHash) {this.passwordHash = passwordHash;}

    public Role getRole() {return role;}

    public void setRole(Role role) {this.role = role;}
}
