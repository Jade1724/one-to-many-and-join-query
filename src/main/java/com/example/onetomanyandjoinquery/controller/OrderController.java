package com.example.onetomanyandjoinquery.controller;

import com.example.onetomanyandjoinquery.dto.OrderRequest;
import com.example.onetomanyandjoinquery.entity.Customer;
import com.example.onetomanyandjoinquery.repository.CustomerRepository;
import com.example.onetomanyandjoinquery.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

  @Autowired
  private CustomerRepository customerRepository;
  @Autowired
  private ProductRepository productRepository;

  @PostMapping("/placeOrder")
  public Customer placeOrder(@RequestBody OrderRequest request) {
    return customerRepository.save(request.getCustomer());
  }

  @GetMapping("/findAllOrders")
  public List<Customer> findAllOrders() {
    return customerRepository.findAll();
  }
}
