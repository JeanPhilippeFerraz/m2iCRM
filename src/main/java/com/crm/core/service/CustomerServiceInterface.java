package com.crm.core.service;

import com.crm.core.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerServiceInterface {

    public List<Customer> getAll();

    public Customer getById(Integer id) throws Exception;
    public Customer createCustomer(Customer customer);
    public void deleteCustomer(Integer id);
    public Customer updateCustomer(Customer customer) throws Exception;
}
