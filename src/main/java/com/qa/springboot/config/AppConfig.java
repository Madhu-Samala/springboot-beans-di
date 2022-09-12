package com.qa.springboot.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.qa.springboot.bean.Address;
import com.qa.springboot.bean.Employee;

/*
 * Bean Configuration file
 */
@Configuration
public class AppConfig {
	
	/*
	 * @Bean(name = "emp1", initMethod = "init", destroyMethod = "cleanup")
	 * //@Scope("prototype") //@Lazy public Employee getEmployee() { return new
	 * Employee(111,"emp1","emp1@gmail.com","3453223",32423.234); }
	 * 
	 * @Bean(name = "emp2") public Employee getEmployee2() { return new
	 * Employee(222,"emp2","emp2@gmail.com","4453223",42423.234); }
	 */
	
	/*
	 * @Bean(name = "emp1") public Employee getEmployee() { return new Employee(); }
	 */
	
	@Bean
	@Qualifier("homeaddress")
	public Address getHomeAddress() {
		return new Address(111,"5-55","New York Street","New York",2342322);
	}
	
	@Bean
	@Qualifier("officeaddress")
	public Address getOfficeAddress() {
		return new Address(222,"6-65","New York Street1","New York1",3342322);
	}

}
