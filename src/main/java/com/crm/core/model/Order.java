package com.crm.core.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Double adrEt;
    private Double numberOfDays;
    private Double tva;
    private String status;
    private String type;
    private String notes;
    @ManyToOne
    @JoinColumn(name = "id")
    private Customer customer;

    public Order() {
    }

    public Order(Integer id, Double adrEt, Double numberOfDays, Double tva, String status, String type, String notes,
                 Customer customer) {
        this.id = id;
        this.adrEt = adrEt;
        this.numberOfDays = numberOfDays;
        this.tva = tva;
        this.status = status;
        this.type = type;
        this.notes = notes;
        this.customer = customer;
    }
}
