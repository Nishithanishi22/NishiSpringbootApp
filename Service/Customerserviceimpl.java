package MyFirstWebApplication.cbs06.Service;

import MyFirstWebApplication.cbs06.Controller.Customer;
import MyFirstWebApplication.cbs06.Entity.CustomerEntity;
import MyFirstWebApplication.cbs06.Repository.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Customerserviceimpl implements  CustomerService{

    @Autowired
    CustomerRepository customerrepository;

    @Override
    public String createCustomer(Customer customer) {
        CustomerEntity customerentity = new CustomerEntity();
        BeanUtils.copyProperties(customer, customerentity);

        customerrepository.save(customerentity);
        return "saved Successfully";
    }

    @Override
    public List<Customer> readCustomers() {
        List<CustomerEntity> customersList = customerrepository.findAll();

        List<Customer> customers = new ArrayList<>();

        for (CustomerEntity customerEntity : customersList) {

            Customer customer = new Customer();

            customer.setId(customerEntity.getId());
            customer.setFirst_name(customerEntity.getFirst_name());
            customer.setLast_name(customerEntity.getLast_name());
            customer.setEmail(customerEntity.getEmail());

            customers.add(customer);
        }
        return customers;
    }

    @Override
    public Boolean deleteCustomer(Long id) {
        CustomerEntity customer = customerrepository.findById(id).get();
        customerrepository.delete(customer);
        return true;
    }




}
