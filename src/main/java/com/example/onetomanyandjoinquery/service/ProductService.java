package com.example.onetomanyandjoinquery.service;

import com.example.onetomanyandjoinquery.entity.Customer;
import com.example.onetomanyandjoinquery.entity.Product;

public interface ProductService {

  Customer addProduct(int customerId, Product product);

}
