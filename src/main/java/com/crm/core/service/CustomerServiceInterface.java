package com.crm.core.service;

import com.crm.core.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerServiceInterface {

    public List<Customer> getAll();

    public Customer> getId(Integer id) throws Exception;
    public Customer createCustomer(Customer customer);
    public Boolean deleteCustomer(Customer customer);
    public Customer updateCustomer(Customer customer) throws Exception;
}
