package net.shivam.NIT.Springboot_restful_web_Service.Service;

import net.shivam.NIT.Springboot_restful_web_Service.Entity.User;

import java.util.List;

public interface UserService {

    // creating the method userRepository
   public User CreateUser(User user) ;


   // creating another method
    User getByID(Long ID) ;

    // creating the interface of the method of the all user
    //  the return the list of the all element of the database
    List<User>AllUser() ;
    // creating a different interface

}
