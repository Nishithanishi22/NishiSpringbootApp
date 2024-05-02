package MyFirstWebApplication.cbs06.Controller;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
    private    Long      id;

    private    String    First_name;

    private    String    Last_name;

    private    String    Email;



}
