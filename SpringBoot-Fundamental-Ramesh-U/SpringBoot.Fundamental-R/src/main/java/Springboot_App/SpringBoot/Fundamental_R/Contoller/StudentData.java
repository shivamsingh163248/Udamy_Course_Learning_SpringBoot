package Springboot_App.SpringBoot.Fundamental_R.Contoller;

import Springboot_App.SpringBoot.Fundamental_R.bean.StudentDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

// using the rest controller combination of the two annotation for the handel the api
@RestController
public class StudentData {

    // creating the method two return the method
    // handel the request of the https

    //creating the list
    private List<StudentDetails>allStudentDetails ;


    @GetMapping("/studentDetails")
    public StudentDetails studentDetails(){
        return new StudentDetails("shvam singh " , 3434 , "satyendra kumar singh " , "sarita singh ") ;
    }

    // creating the api for the return data in the form of list in the jason
    @GetMapping("/allStudent")
    public List<StudentDetails> AllStudentData(){

        // creating the list and adding the all the data in the list
        List<StudentDetails>AllStudent = new ArrayList<>() ;
        // creating the object of the class and the adding in the list
        AllStudent.add(new StudentDetails("shivam" , 3443 , "satyendra kumar singh " , "sarita singh ")) ;
        AllStudent.add(new StudentDetails("anuj singh " , 4354675 , "rb singh " , "geeta signh")) ;
        AllStudent.add(new StudentDetails("lovely singh " , 8369 , "taj singh " , "mata rani")) ;
        return AllStudent;
    }

    // creating the learning the path parameter
    @GetMapping("/studentall/{id}")
    public StudentDetails ParticularDetails(@PathVariable int id){
        List<StudentDetails>AllStudents = new ArrayList<>() ;
        AllStudents.add(new StudentDetails("shivam" , 3443 , "satyendra kumar singh " , "sarita singh ")) ;
        AllStudents.add(new StudentDetails("anuj singh " , 4354675 , "rb singh " , "geeta signh")) ;
        AllStudents.add(new StudentDetails("lovely singh " , 8369 , "taj singh " , "mata rani")) ;

        // now creating the loop and details
        return AllStudents.get(id) ;

    }


}
