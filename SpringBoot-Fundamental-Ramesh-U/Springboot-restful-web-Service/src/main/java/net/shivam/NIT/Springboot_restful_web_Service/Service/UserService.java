package net.shivam.NIT.Springboot_restful_web_Service.Service;

import net.shivam.NIT.Springboot_restful_web_Service.Entity.User;

public interface UserService {

    // creating the method userRepository
   public User CreateUser(User user) ;


   // creating another method
    User getByID(Long ID) ;

}
