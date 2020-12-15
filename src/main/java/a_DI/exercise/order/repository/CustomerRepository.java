package a_DI.exercise.order.repository;

import a_DI.exercise.order.domain.Customer;

public interface CustomerRepository {
	void save(Customer customer);
	void delete(long id);
}
