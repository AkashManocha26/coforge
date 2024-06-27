package com.abc.model;
import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Lazy(value=true)
public class Car {
	private long regNo;
	private String  model;
	private float cost;
	
	@PostConstruct
	public void start() {
		System.out.println(getClass().getSimpleName()+" init called");
		this.regNo=877876767;
		this.model="celario";
		this.cost=670000;
	}
	
}
