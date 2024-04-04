package com.muccio.springcourse.repositories;

import com.muccio.springcourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
