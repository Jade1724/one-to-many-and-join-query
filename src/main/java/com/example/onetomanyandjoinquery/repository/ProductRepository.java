package com.example.onetomanyandjoinquery.repository;

import com.example.onetomanyandjoinquery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
