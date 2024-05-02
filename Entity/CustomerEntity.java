package MyFirstWebApplication.cbs06.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "customer_info")

public class CustomerEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private     Long      id;

    private     String    First_name;

    private     String    Last_name;

    private     String    Email;
}
