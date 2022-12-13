package com.crm.core.api.dto;

import com.crm.core.model.Order;
import lombok.Data;

import java.util.Set;

@Data
public class CustomerDto {

    private Integer id;
    private String lastName;
    private String firstName;
    private String company;
    private String mail;
    private String phone;
    private String mobile;
    private String notes;
    private Boolean active;
    private Set<Order> orders;
}
