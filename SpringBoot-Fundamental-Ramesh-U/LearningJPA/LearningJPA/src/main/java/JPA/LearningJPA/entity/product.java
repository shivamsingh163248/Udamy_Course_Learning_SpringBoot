package JPA.LearningJPA.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class product {

    // creating the variable for the mapping table in the data base
    private int id ;
    private String sku ;
    private  String name ;
    private String description ;
    private BigDecimal prise ;
    private  boolean active ;
    private  String imageUrl ;
    private LocalDateTime dateCreated ;
    private LocalDateTime lastUpdate ;



}
