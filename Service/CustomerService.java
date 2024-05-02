package MyFirstWebApplication.cbs06.Service;

import MyFirstWebApplication.cbs06.Controller.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
public interface CustomerService {
    String createCustomer (Customer customer);
    List<Customer> readCustomers();
    Boolean deleteCustomer(Long id);
    //String updateCustomer(Long id Customer customer);
}
