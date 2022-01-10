package com.example.onetomanyandjoinquery.repository;

import com.example.onetomanyandjoinquery.dto.OrderResponse;
import com.example.onetomanyandjoinquery.entity.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

  @Query("SELECT new com.example.onetomanyandjoinquery.dto.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p")
  public List<OrderResponse> getJoinInformation();

}
