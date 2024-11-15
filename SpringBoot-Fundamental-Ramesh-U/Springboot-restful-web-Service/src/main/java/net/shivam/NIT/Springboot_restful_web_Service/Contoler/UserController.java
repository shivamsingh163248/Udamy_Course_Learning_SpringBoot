package net.shivam.NIT.Springboot_restful_web_Service.Contoler;

import lombok.AllArgsConstructor;
import net.shivam.NIT.Springboot_restful_web_Service.Entity.User;
import net.shivam.NIT.Springboot_restful_web_Service.Service.Impl.UserServiceImpl;
import net.shivam.NIT.Springboot_restful_web_Service.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/all")
public class UserController {

private UserService userService ;


    // creating the method
    // hears we are the using the response entity that are the using return the response with satus code
    @PostMapping
    public ResponseEntity<User>CreateData(@RequestBody User user){
         User user1 = userService.CreateUser(user) ;
         // return the response with the status code
        return new ResponseEntity<>(user1 , HttpStatus.CREATED) ;
    }


}
