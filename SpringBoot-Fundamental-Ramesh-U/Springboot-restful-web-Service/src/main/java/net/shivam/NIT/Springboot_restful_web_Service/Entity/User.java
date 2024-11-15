package net.shivam.NIT.Springboot_restful_web_Service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "User")
public class User {

    // hear we are the defining all the entity required for the user management
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(nullable = false)
    private String fistName ;
    @Column(nullable = false)
    private String lastName ;
    @Column(nullable = false , unique = true)
    private String email ;

}
