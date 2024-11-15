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
    // learning Query Method


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


    // return the method name of the match in the databases that list are the return
    @Test
    void FindByNameContains(){
        // calling the method from the interface of the product repository that extends a jpa
        List<Product>productList  = productRepository.findBySkuContaining("This is the samsung phone") ;

        // now printing all record in the databases
        productList.forEach((e) -> {
            System.out.println(e.getPrice());
            System.out.println(e.getDescription());

        });
    }


    // learning the like method
    @Test
    void FindByLikeMethod(){
        // hear we are the learning the like method
        List<Product>AllProduct = productRepository.findBySkuLike("This is the samsung phone") ;
        // creating the foreach loop for the testing of the each object containing in the list
        AllProduct.forEach((e) ->{

            System.out.println(e.getPrice());
            System.out.println(e.getDescription());

        });
    }


    // creating the method for the between
    @Test
    void FindByBetweenMethod(){

        // we are the learning method
        List<Product>AllPriseRange = productRepository.findByPriceBetween(new BigDecimal(500) , new BigDecimal(1100)) ;
        // creating the for each loop for the iterating all the object
        AllPriseRange.forEach((e)->{
            System.out.println(e.getProductName());
        });
    }

    // learning the between method in the query
    @Test
    void  LearningBetween(){

        // now writing the method
        List<Product>Between = productRepository.findByPriceBetween(new BigDecimal(1000) , new BigDecimal(6000));
        // return the list
        // using the for each loop we are the printing All the details
        // using the for each loop you can print all the details

    }







}
