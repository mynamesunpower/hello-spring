package a_DI.exercise.order.service;

import a_DI.exercise.order.domain.Customer;

public interface CustomerService {

	void saveCustomer(Customer customer);

	void deleteCustomer(long id);
}
