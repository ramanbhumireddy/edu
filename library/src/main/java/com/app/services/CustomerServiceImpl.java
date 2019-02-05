//package com.app.services;
//
//import java.util.List;
//
//import org.springframework.data.domain.PageRequest;
//
//import com.app.models.Customer;
//import com.app.repos.CustomerRepository;
//
//public class CustomerServiceImpl implements CustomerService {
//
//	private CustomerRepository customerRepository;
//
//	@Override
//	public Customer create(Customer customer) {
//		return customerRepository.save(customer);
//	}
//
//	@Override
//	public Customer get(Long id) {
//		return customerRepository.findOne(id);
//	}
//
//	@Override
//	public Customer edit(Customer customer) {
//		return customerRepository.save(customer);
//	}
//
//	@Override
//	public void delete(Customer customer) {
//		customerRepository.delete(customer);
//	}
//
//	@Override
//	public void delete(Long id) {
//		customerRepository.delete(id);
//	}
//
//	@Override
//	public List<Customer> getAll(int pageNumber, int pageSize) {
//		return customerRepository.findAll(new PageRequest(pageNumber, pageSize)).getContent();
//	}
//
//	@Override
//	public List<Customer> getAll() {
//		return customerRepository.findAll();
//	}
//
//	@Override
//	public long count() {
//		return customerRepository.count();
//	}
//
//}
