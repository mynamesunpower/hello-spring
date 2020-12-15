package a_DI.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import a_DI.exercise.order.domain.Customer;
import a_DI.exercise.order.service.CustomerService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new 	ClassPathXmlApplicationContext("beans.xml");
	
		Customer customer = (Customer)ctx.getBean("customer");
	
		
		CustomerService customerService = (CustomerService)ctx.getBean("customerService");
		customerService.saveCustomer(customer);
		customerService.deleteCustomer(1);		
		
	}

}
