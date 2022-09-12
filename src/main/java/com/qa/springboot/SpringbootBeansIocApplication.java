package com.qa.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.qa.springboot.bean.Employee;

@SpringBootApplication
public class SpringbootBeansIocApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootBeansIocApplication.class, args);
		/*
		 * this is the core container which manages beans
		 */

		/*
		 * By default fetches by Type Employee employee =
		 * context.getBean(Employee.class); System.out.println(employee);
		 */
		
		  //Employee emp1 = (Employee) context.getBean("emp1"); System.out.println(emp1);
		  
			/*
			 * Employee emp2 = context.getBean("emp2",Employee.class);
			 * System.out.println(emp2);
			 */
		  
		  Employee emp1 = context.getBean("emp1",Employee.class);
		  System.out.println(emp1);
		  
		  Employee emp111 = context.getBean("emp1",Employee.class);
		  System.out.println(emp111);
		  
		  System.out.println(emp1 == emp111);
		  
		 ((ConfigurableApplicationContext) context).close();
		  
		 

	}

}
