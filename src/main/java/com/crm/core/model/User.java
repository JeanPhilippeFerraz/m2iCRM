package com.crm.core.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String password;
    private String mail;
    private String grants;

    public User() {
    }

    public User(Integer id, String password, String mail, String grants) {
        this.id = id;
        this.password = password;
        this.mail = mail;
        this.grants = grants;
    }
}
