package com.example.onetomanyandjoinquery.dto;

import com.example.onetomanyandjoinquery.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

  private Customer customer;


}
