package com.example.onetomanyandjoinquery.dto;

import com.example.onetomanyandjoinquery.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddProductRequest {

  private int customerId;
  private Product product;

}
