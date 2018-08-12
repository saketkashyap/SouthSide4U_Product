package com.ibm.southside4u.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity

public class Product {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    @NotNull
	    private String producttype;
	    @NotNull
	    private String productname;
}
