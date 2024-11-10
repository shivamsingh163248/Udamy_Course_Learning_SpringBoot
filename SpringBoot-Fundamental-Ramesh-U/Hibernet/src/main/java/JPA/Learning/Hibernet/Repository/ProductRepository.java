package JPA.Learning.Hibernet.Repository;

import JPA.Learning.Hibernet.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , Long> {


    // learning the Query method

/*    Return the found product entry by using its name as a search
    criteria. if no product entry is found, this method returns null*/

    public Product findByName(String name) ;



}
