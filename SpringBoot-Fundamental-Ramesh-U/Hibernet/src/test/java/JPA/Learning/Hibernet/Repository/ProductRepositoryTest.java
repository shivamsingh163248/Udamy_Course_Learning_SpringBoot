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

    }


}