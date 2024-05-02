package MyFirstWebApplication.cbs06.Repository;

import MyFirstWebApplication.cbs06.Entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>
{

}
