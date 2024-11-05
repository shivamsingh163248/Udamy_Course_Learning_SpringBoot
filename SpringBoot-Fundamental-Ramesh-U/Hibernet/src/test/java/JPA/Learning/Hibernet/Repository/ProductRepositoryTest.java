package JPA.Learning.Hibernet.Repository;

import JPA.Learning.Hibernet.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    // creating the field based dependency injection
    @Autowired
    private ProductRepository productRepository ;

    // creating a test annotation
    @Test
    void productDetail(){

        // creating the object of the product class and the set the values because we are the using the lombok library
        Product product = new Product() ;
        // creating the set of all the product object method \
        product.setProductName("Iphone");
        product.setSku("Iphone 12");
        product.setPrice(1000);
        product.setDescription("This is the best phone");
        product.setActive(true);
        product.setImageUrl("https://www.google.com");
        product.setId(1L);


        // Now all the details to save in the database
        Product data = productRepository.save(product) ;

        // now creating a println for the printing
        System.out.println(data.getId());
        System.out.println(data.toString()) ;

    }
}