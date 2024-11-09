package JPA.Learning.Hibernet.Repository;

import JPA.Learning.Hibernet.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

    // creating the updating in the database repository
    // creating the method for the using the test annotation

    @Test
    void Updating(){

        // TAKING THE OBJECT IN  THE PRODUCT AND USING THE BIDGET AND GET
        Long id  = 1L ;
        Product UpdatingProduct = productRepository.findById(id).get() ;
        UpdatingProduct.setPrice(454);
        UpdatingProduct.setProductName("iPhone15");

        // we are the updating the two quantity

        // using the save method to save the all
        productRepository.save(UpdatingProduct) ;


    }

// fetching the product using the find by id
    @Test
    void findByIdMethod(){
        Long id  = 1L ;

        // Now Retrieve data from the databases
        Product product = productRepository.findById(id).get() ;

        // now check the printing of the product
        System.out.println(product);
    }


    // again creating and the learning the saveALL method
    // creating the method name save all the method
    @Test
    void saveAllMethod(){
        // we are the learning the save all the method
        // creating the object
        Product product1 = new Product()  ;
        product1.setId(2L);
        product1.setProductName("Mi");
        product1.setSku("this is the mi phone ");
        product1.setPrice(6000);
        product1.setDescription("This is the best phone");
        product1.setActive(true);
        product1.setImageUrl("https://www.google.com");



        // creating the dummy object and set tha the value
        Product product2 = new Product() ;
        product2.setId(3L);
        product2.setProductName("Samsung");
        product2.setSku("This is the samsung phone");
        product2.setPrice(1000);
        product2.setDescription("This is the best phone");
        product2.setActive(true);
        product2.setImageUrl("https://www.google.com");

        // now using the save all the method
        productRepository.saveAll(List.of(product1,product2)) ; // this is the list of the product



    }

    // learning the find all the method
    @Test
    void FindAllMethod(){

        // creating the product list and retrieve all the data from the databases
        List<Product>allData = productRepository.findAll() ;
        // now print all data
        allData.forEach((e)->{
            System.out.println(e.getProductName());
        });
    }


}