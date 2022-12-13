package com.crm.core.api;

import com.crm.core.model.Customer;
import com.crm.core.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerApi {

    @Autowired
    private CustomerServiceInterface service;

    @GetMapping
    public @ResponseBody
    ResponseEntity<List<Customer>> list() {
        List<Customer> customers = service.getAll();
        return (customers == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(customers);
    }

    @RequestMapping("/{id}")
    public ResponseEntity<Customer> getById (@PathVariable("id") int id) throws Exception {
        Customer customer = service.getById(id);
        return (customer == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(customer);
    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        Customer createdCustomer = service.createCustomer(customer);
        return (createdCustomer == null) ? ResponseEntity.unprocessableEntity().build() : ResponseEntity.ok(createdCustomer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        service.deleteCustomer(id);
    }
}
