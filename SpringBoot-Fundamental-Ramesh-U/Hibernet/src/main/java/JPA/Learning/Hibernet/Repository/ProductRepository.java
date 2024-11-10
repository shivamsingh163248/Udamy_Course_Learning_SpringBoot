package JPA.Learning.Hibernet.Repository;

import JPA.Learning.Hibernet.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product , Long> {


    // learning the Query method

/*    Return the found product entry by using its name as a search
    criteria. if no product entry is found, this method returns null*/

    public Product findByPrice(int prices) ;
    public Product findBySku(String sku) ;

    // using the optional method writing the find the by id
    Optional<Product>findById(Long id) ;



  //   public Product findByProductName(String productNane) ;

    // using the Query my multiple name
    public List<Product> findByPriceOrSku(int prise , String sku) ;

      // also writing for the And Method
      public List<Product> findByPriceAndSku(int prise , String sku) ;


      // creating the and learning the unique and distinct method
     public  Product findDistinctByPrice(int prise) ;

     // learning the find byGreater then
     // Its is the return type is list
     public  List<Product> findByPriceGreaterThan(BigDecimal prise) ;

     // creating the less then method
    public  List<Product>findByPriceLessThan(BigDecimal prise) ;

    // return the filter record with the given name
     public List<Product>findBySkuContaining(String sku) ;

     // findByLike
    public List<Product>findBySkuLike(String sku) ;

    // findByBetween
    public List<Product>findByPriceBetween(BigDecimal prise , BigDecimal price) ;



}
