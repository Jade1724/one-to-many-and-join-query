package com.example.onetomanyandjoinquery.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_DEFAULT)
public class OrderResponse {

  private String name;
  private String productName;

  public OrderResponse(String name, String productName) {
    this.name = name;
    this.productName = productName;
  }

  private int price;

}
