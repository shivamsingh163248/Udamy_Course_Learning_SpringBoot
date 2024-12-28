package RestFul_Api.Learning.Enity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    // creating the fields for the user details
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(nullable = false)
    private String name ;
    @Column(nullable = false)
    private String last_name ;
    @Column(nullable = false , unique = true)
    private int RollNo ;
    @Column(nullable = false , unique = true)
    private int email ;

}
