package com.crm.core.service.impl;

import com.crm.core.model.Customer;
import com.crm.core.model.Order;
import com.crm.core.repository.OrderRepositoryInterface;
import com.crm.core.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderServiceInterface {

    @Autowired
    OrderRepositoryInterface repository;

    @Override
    public List<Order> getAll() {

        return repository.findAll();
    }

    @Override
    public Order getById(Integer id) throws Exception {

        return repository.findById(id).orElseThrow(Exception::new);
    }

    @Override
    public Order createOrder(Order order) {

        return repository.save(order);
    }
    @Override
    public void deleteOrder(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Order updateOrder(Order order) throws Exception {

        Order orderUpd = repository.findById(order.getId()).orElseThrow(Exception::new);

        orderUpd.setAdrEt(order.getAdrEt());
        orderUpd.setNumberOfDays(order.getNumberOfDays());
        orderUpd.setTva(order.getTva());
        orderUpd.setStatus(order.getStatus());
        orderUpd.setType(order.getType());
        orderUpd.setNotes(order.getNotes());
        orderUpd.setCustomer(order.getCustomer());
        
        return repository.save(orderUpd);
    }
}
