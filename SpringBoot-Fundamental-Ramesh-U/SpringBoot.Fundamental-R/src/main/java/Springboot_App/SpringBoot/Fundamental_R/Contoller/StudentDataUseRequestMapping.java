package Springboot_App.SpringBoot.Fundamental_R.Contoller;

import Springboot_App.SpringBoot.Fundamental_R.bean.StudentDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requestMapping")
public class StudentDataUseRequestMapping {


    // creating the Method for the mapping
    @GetMapping("/Shivam")
    public ResponseEntity<StudentDetails>test(){
        StudentDetails studentDetails = new StudentDetails("itisha singh " , 544445 , "satyendra kumar singh " , "saritia singh") ;
        return new ResponseEntity<>(studentDetails , HttpStatus.OK) ;
    }
}
