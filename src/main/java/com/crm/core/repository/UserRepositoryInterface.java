package com.crm.core.repository;

import com.crm.core.model.Order;
import com.crm.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoryInterface extends JpaRepository<User, Integer> {
}
