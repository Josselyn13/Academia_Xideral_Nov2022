package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.*;
import lombok.*;

@Data 
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name="cat")
public class Cat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="breed")
	private String breed;
	
	@Column(name="age")
	private int age;

	
}











