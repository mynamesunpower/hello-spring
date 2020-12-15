package a_DI.exercise.order.repository;

import a_DI.exercise.order.domain.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {


	@Override
	public void save(Customer customer) {
		System.out.println(customer + "가 저장되었습니다.");
	}
	@Override
	public void delete(long id) {
		System.out.println(id + "번 고객이 삭제되었습니다.");
	}

}