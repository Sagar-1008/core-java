package com.xworkz.library.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BookDTO {
       
	 private int id;
	 private String name;
	 private String author;
	 private String publication;
	 private String type;
 
}
