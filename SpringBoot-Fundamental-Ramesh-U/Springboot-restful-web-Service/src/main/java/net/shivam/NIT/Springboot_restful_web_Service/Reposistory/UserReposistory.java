package net.shivam.NIT.Springboot_restful_web_Service.Reposistory;

import net.shivam.NIT.Springboot_restful_web_Service.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposistory extends JpaRepository<User , Long> {

}
