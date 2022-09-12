package com.qa.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.qa.springboot.bean.Employee;

/*
 * Bean Configuration file
 */
@Configuration
public class AppConfig {
	
	@Bean(name = "emp1", initMethod = "init", destroyMethod = "cleanup")
	//@Scope("prototype")
	//@Lazy
	public Employee getEmployee() {
		return new Employee(111,"emp1","emp1@gmail.com","3453223",32423.234);
	}

	@Bean(name = "emp2")
	public Employee getEmployee2() {
		return new Employee(222,"emp2","emp2@gmail.com","4453223",42423.234);
	}
	

}
