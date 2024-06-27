package com.abc.model;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.abc.UserMain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

//@AllArgsConstructor
@Data
@Getter
@ToString
@Lazy(value=true)
@Component
public class Department {
	private long deptId;
	private String deptName;
	private String deptLocation;
	private int deptTotalMember;
	
	@PostConstruct
	public void initDept() {
		System.out.println(getClass().getSimpleName()+" init called");
		this.deptId=987896;
		this.deptName="Software Development Department";
		this.deptLocation="Pune";
		this.deptTotalMember=560;
	}
}
