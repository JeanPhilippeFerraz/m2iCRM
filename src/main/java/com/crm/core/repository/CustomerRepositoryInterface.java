package com.crm.core.repository;

import com.crm.core.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositoryInterface extends JpaRepository<Customer, Integer> {
}
