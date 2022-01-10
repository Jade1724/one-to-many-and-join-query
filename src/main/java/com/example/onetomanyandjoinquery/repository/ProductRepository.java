package com.example.onetomanyandjoinquery.repository;

import com.example.onetomanyandjoinquery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
