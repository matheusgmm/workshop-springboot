package com.muccio.springcourse.repositories;

import com.muccio.springcourse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
