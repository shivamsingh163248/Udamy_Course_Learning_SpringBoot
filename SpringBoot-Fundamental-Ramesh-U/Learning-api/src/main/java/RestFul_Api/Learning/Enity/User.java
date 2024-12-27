package RestFul_Api.Learning.Enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    // creating the fields for the user details
    @Id
    private Long id ;
    private String name ;
    private String last_name ;
    private int RollNo ;
    private int email ;

}
