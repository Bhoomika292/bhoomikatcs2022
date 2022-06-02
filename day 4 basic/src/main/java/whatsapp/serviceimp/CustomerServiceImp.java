package whatsapp.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import whatsapp.bean.Customer;
import whatsapp.repository.MyLocalRepository;
import whatsapp.service.CustomerService;
@Service
public class CustomerServiceImp implements CustomerService{
	@Autowired
	MyLocalRepository myLocalRepository;
	@Override
	public Customer addCustomer(Customer customer) {
		Customer customeradded = myLocalRepository.save(customer);
				return customeradded;
	}

}