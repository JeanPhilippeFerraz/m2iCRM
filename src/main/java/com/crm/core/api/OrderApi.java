package com.crm.core.api;

import com.crm.core.model.Order;
import com.crm.core.service.OrderServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/order")
public class OrderApi {

    @Autowired
    private OrderServiceInterface service;

    @GetMapping
    public @ResponseBody
    ResponseEntity<List<Order>> list() {
        List<Order> orders = service.getAll();
        return (orders == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(orders);
    }

    @RequestMapping("/{id}")
    public ResponseEntity<Order> getById (@PathVariable("id") int id) throws Exception {
        Order order = service.getById(id);
        return (order == null) ? ResponseEntity.notFound().build() : ResponseEntity.ok(order);
    }

    @PostMapping
    public ResponseEntity<Order> create(@RequestBody Order order) {
        Order createdOrder = service.createOrder(order);
        return (createdOrder == null) ? ResponseEntity.unprocessableEntity().build() : ResponseEntity.ok(createdOrder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id){
        service.deleteOrder(id);
        return ResponseEntity.ok().build();
    }
}
