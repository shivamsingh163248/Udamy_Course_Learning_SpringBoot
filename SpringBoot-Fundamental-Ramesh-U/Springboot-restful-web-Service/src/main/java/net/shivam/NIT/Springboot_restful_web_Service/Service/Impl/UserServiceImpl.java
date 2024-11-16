package net.shivam.NIT.Springboot_restful_web_Service.Service.Impl;

import lombok.AllArgsConstructor;
import net.shivam.NIT.Springboot_restful_web_Service.Entity.User;
import net.shivam.NIT.Springboot_restful_web_Service.Reposistory.UserReposistory;
import net.shivam.NIT.Springboot_restful_web_Service.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

  private UserReposistory userReposistory ;

    @Override
    public User CreateUser(User user) {
        return userReposistory.save(user);
        // this is the using for the save method

    }

    @Override
    public User getByID(Long Id) {
        // inside parameter with Counterculture
        // fetch the data from the database and the return user
      Optional<User>details =  userReposistory.findById(Id) ;
      // using the get function we return user details
      return details.get() ;
    }

}
