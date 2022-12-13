package com.crm.core.service.impl;

import com.crm.core.model.Customer;
import com.crm.core.repository.CustomerRepositoryInterface;
import com.crm.core.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerServiceInterface {

    @Autowired
    CustomerRepositoryInterface repository;

    @Override
    public List<Customer> getAll() {

        return repository.findAll();
    }

    @Override
    public Customer getById(Integer id) throws Exception {
        return repository.findById(id).orElseThrow(Exception::new);
    }

    @Override
    public Customer createCustomer(Customer customer) {

        return repository.save(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {

        repository.deleteById(id);
    }

    @Override
    public Customer updateCustomer(Customer pCustomer) throws Exception {

        Customer customer = repository.findById(pCustomer.getId()).orElseThrow(Exception::new);

        customer.setLastName(pCustomer.getLastName());
        customer.setFirstName(pCustomer.getFirstName());
        customer.setCompany(pCustomer.getCompany());
        customer.setMail(pCustomer.getMail());
        customer.setPhone(pCustomer.getPhone());
        customer.setMobile(pCustomer.getMobile());
        customer.setNotes(pCustomer.getNotes());
        customer.setActive(pCustomer.getActive());
        customer.setOrders(pCustomer.getOrders());

        return repository.save(customer);

    }
}
