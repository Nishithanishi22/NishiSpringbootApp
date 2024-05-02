package MyFirstWebApplication.cbs06.Controller;


import MyFirstWebApplication.cbs06.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("customers")
    public List<Customer>  getAllCustomers() {
        return customerService.readCustomers();
    }

    @PostMapping("customers")
    public String createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @DeleteMapping ("customers/{id}")
    public String deleteCustomer (@PathVariable Long id){
        if (customerService.deleteCustomer(id))
            return "Delete Successfully";
        return "Not found";
    }

}


