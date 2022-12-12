package com.crm.core.repository;

import com.crm.core.model.Customer;
import com.crm.core.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryInterface extends JpaRepository<Order, Integer> {
}
