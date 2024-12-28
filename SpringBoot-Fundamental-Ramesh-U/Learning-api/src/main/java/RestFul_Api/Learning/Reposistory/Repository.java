package RestFul_Api.Learning.Reposistory;

import RestFul_Api.Learning.Enity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User , Long> {
}
