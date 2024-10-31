package JPA.Learning.Hibernet.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

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
    private LocalDateTime dataDateTimeCreated ;
    private LocalDateTime lastUpdate ;

    // creating the getter and setter method


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getDataDateTimeCreated() {
        return dataDateTimeCreated;
    }

    public void setDataDateTimeCreated(LocalDateTime dataDateTimeCreated) {
        this.dataDateTimeCreated = dataDateTimeCreated;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
