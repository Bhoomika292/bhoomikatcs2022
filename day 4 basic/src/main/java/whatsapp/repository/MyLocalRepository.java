package whatsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import whatsapp.bean.Customer;
@Repository
public interface MyLocalRepository extends JpaRepository<Customer, Long>{

}
