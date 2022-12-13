package com.crm.core.service;

import com.crm.core.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderServiceInterface {

    public List<Order> getAll();
    public Order getById(Integer id) throws Exception;
    public Order createOrder(Order order);
    public void deleteOrder(Integer id);
    public Order updateOrder(Order order) throws Exception;

}
