package com.crm.core.service.imp;

import com.crm.core.model.Order;
import com.crm.core.repository.OrderRepositoryInterface;
import com.crm.core.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrderServiceImpl implements OrderServiceInterface {

    @Autowired
    OrderRepositoryInterface repository;

    @Override
    public List<Order> getAll() {
        return repository.findAll();
    }

    @Override
    public Order getById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public Order createOrder(Order order) {
        repository.save(order);

    }

    @Override
    public void deleteOrder() {

    }

    @Override
    public Order updateOrder(Order order) {
        return null;
    }
}
