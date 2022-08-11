package com.xworkz.hotel.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class FoodDTO {

	private int id;
	private String name;
	private double price;
	private String type;
	
}
