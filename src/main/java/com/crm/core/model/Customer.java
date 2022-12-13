package com.crm.core.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String lastName;
    private String firstName;
    private String company;
    private String mail;
    private String phone;
    private String mobile;
    private String notes;
    private Boolean active;
    @OneToMany(mappedBy="id")
    private Set<Order> orders;

    public Customer() {
    }

    public Customer(Integer id, String lastName, String firstName, String company, String mail, String phone,
                    String mobile, String notes, Boolean active, Set<Order> orders) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.company = company;
        this.mail = mail;
        this.phone = phone;
        this.mobile = mobile;
        this.notes = notes;
        this.active = active;
        this.orders = orders;
    }
}
