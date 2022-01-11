package com.example.onetomanyandjoinquery.service;

import com.example.onetomanyandjoinquery.entity.Customer;
import com.example.onetomanyandjoinquery.entity.Product;
import com.example.onetomanyandjoinquery.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private CustomerRepository customerRepository;

  public Customer addProduct(int customerId, Product product) {
    Customer customer;
    customer = customerRepository.getCustomerById(customerId);
    customer.addProduct(product);
    customerRepository.save(customer);
    return customer;
  }

}
