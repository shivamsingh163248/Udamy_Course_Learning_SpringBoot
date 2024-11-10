package JPA.Learning.Hibernet.Repository;

import JPA.Learning.Hibernet.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QueryMethodTest {

    // learning the test method
    @Autowired
    private ProductRepository productRepository ;
    @Test
    void findByNameMethod(){

        // in the test method
        Product product = productRepository.findByPrice(1000) ;

        // its return the all the object
        // printing all the details
        System.out.println(product.getId());
        System.out.println(product.getProductName());

        Product product1 = productRepository.findBySku("This is the samsung phone") ;

    }

}
