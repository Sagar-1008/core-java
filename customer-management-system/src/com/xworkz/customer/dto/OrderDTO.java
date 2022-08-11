package com.xworkz.customer.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class OrderDTO {
       
	private int id;
	private String name;
	private int quantity;
	private String type;
	
}
