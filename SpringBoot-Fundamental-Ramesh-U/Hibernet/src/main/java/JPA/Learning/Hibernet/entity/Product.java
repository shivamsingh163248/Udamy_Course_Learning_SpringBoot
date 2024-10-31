package JPA.Learning.Hibernet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

// creating the lambok annotation for the reducing the code
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "ProductLog" , schema = "ecommerse" , uniqueConstraints = {
        @UniqueConstraint(name = "PName" , columnNames = "ProductName")
})
public class Product {

    // crating all the properties of the product
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.TABLE)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String ProductName;
    private String sku ;

    // using the colum for the creating a nullable and length and other parameter
    @Column(nullable = false)
    private int price;
    private String Description ;
    private boolean active ;
    private String imageUrl ;
    // creating the time spent annotation in the spring boot
    @CreationTimestamp
    private LocalDateTime dataDateTimeCreated ;
    @UpdateTimestamp
    private LocalDateTime lastUpdate ;

    // creating the getter and setter method


}
