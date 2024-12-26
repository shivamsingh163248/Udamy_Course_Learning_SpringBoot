package net.shivam.NIT.Springboot_restful_web_Service.Contoler;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

import net.shivam.NIT.Springboot_restful_web_Service.Entity.User;
import net.shivam.NIT.Springboot_restful_web_Service.Service.Impl.UserServiceImpl;
import net.shivam.NIT.Springboot_restful_web_Service.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.tokens.Token;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://127.0.0.1:5500")
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

    // again creating the post-request using the url
    // creating the api
    // also using the path variable
    @GetMapping("{Id}")
    public ResponseEntity<User>FindById(@PathVariable("Id") Long Id){

        // calling the method
        // find the data using the id
        User details = userService.getByID(Id) ;
        return new ResponseEntity<>(details, HttpStatus.OK) ;
    }

    // now creating the api for  the all the user
    @GetMapping("/allUser")
    public ResponseEntity<List<User>>AllUser(){
        // now calling the method
        // creating the list method returns the list
        List<User>allDataValues = userService.AllUser() ;
        return new ResponseEntity<>(allDataValues , HttpStatus.OK) ;
    }

    // creating the put request
    @PutMapping("{Id}")
    public ResponseEntity<User>UpdateData(@PathVariable("Id") Long Id , @RequestBody User user){
        // calling the method
        // update the data
        User user1 = userService.CreateUser(user) ;
        return new ResponseEntity<>(user1 , HttpStatus.OK) ;
    }
    // now updating the data using the delete request


}
