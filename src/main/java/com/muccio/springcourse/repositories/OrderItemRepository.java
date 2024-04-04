package com.muccio.springcourse.repositories;

import com.muccio.springcourse.entities.OrderItem;
import com.muccio.springcourse.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
