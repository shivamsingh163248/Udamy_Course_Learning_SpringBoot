package Springboot_App.SpringBoot.Fundamental_R.Contoller;

import Springboot_App.SpringBoot.Fundamental_R.bean.StudentDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// using the rest controller combination of the two annotation for the handel the api
@RestController
public class StudentData {

    // creating the method two return the method
    // handel the request of the https
    @GetMapping("/studentDetails")
    public StudentDetails studentDetails(){
        return new StudentDetails("shvam singh " , 3434 , "satyendra kumar singh " , "sarita singh ") ;
    }
}
