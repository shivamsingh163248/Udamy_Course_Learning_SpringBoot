package JPA.Learning.Hibernet.Repository;

import JPA.Learning.Hibernet.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

    // creating the j unit test method
    @Test
    void findByID(){

        // calling the method find by product
        Product product = productRepository.findById(153L).get() ;
        // Printing all the details
        System.out.println(product.getSku());
        System.out.println(product.getDescription());
    }
//
//    @Test
//    void  findByProductMethod(){
//        Product product = productRepository.findByProductName("Samsung");
//    }


    // now writing the test case for the
    @Test
    void MultiModalQuery(){
        List<Product>ProductList = productRepository.findByPriceOrSku(1000, "This is the samsung phone");

        // creating the for each loop printing the object
        ProductList.forEach((e) -> {
            System.out.println(e.getId());
        });

    }


}
