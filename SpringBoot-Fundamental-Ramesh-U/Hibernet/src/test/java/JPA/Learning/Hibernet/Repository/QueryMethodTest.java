package JPA.Learning.Hibernet.Repository;

import JPA.Learning.Hibernet.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
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

    // now creating the method of the and

    @Test
    void MultiModalAndMethod(){

        // multi filed attribute using the and
        // its return the list of the that object
        List<Product> productList = productRepository.findByPriceAndSku(6000 , "This is the samsung phone") ;

        // creating the for each loop
        productList.forEach((e) -> {

            // showing the result
            System.out.println(e.getId());
            System.out.println(e.getProductName());
        });

    }

 // learning the finddisticby method
 @Test
 void Distinct(){
        // calling the method
     Product product = productRepository.findDistinctByPrice(6000);
     // printing all the details of the require fetch from the data bases
     System.out.println(product.getProductName());
     System.out.println(product.getDescription());
     System.out.println(product.getSku());
 }

 // learning the greater than method using the Query
    @Test
    void findByPriceGreaterThanMethod(){
        // calling the function
        List<Product> productList = productRepository.findByPriceGreaterThan(new BigDecimal(100)) ;
        // and the printing all details in the record
        // creating the for each loop for the printing all the object
        productList.forEach((e) ->{
            System.out.println(e.getPrice());
            System.out.println(e.getDescription());
            System.out.println(e.getSku());
            System.out.println(e.getProductName());
        });

    }

 // creating the method of the less then
    @Test
    void LessThenMethod(){

        // its return the list
        List<Product>productList = productRepository.findByPriceLessThan(new BigDecimal(6000)) ;
        // creating the for each loop for the retrieve all the record
productList.forEach((e) ->{
    System.out.println(e.getPrice());
    System.out.println(e.getDescription());
    System.out.println(e.getSku());
    System.out.println(e.getProductName());
});
    }


}
