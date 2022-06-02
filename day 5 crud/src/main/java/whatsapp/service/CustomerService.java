package whatsapp.service;

import java.util.List;

import whatsapp.bean.Customer;

public interface CustomerService {
	 
	
	List<Customer> getAllListOfCustomers();
	
	List<Customer> getCustomerList();
	

	Customer updateCustomer(Customer customer,Long id);
	
	void deleteCustomerById(Long id);

	Customer saveCustomer(Customer customer);
	
}
