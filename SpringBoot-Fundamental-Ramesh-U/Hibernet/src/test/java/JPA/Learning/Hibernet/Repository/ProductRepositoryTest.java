package JPA.Learning.Hibernet.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DataJpaTest
class ProductRepositoryTest {

    // creating the field based dependency injection
    @Autowired
    private ProductRepository productRepository ;


}