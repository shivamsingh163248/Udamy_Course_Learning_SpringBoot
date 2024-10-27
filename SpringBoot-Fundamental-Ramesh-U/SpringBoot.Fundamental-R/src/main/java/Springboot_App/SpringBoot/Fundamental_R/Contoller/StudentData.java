package Springboot_App.SpringBoot.Fundamental_R.Contoller;

import Springboot_App.SpringBoot.Fundamental_R.bean.StudentDetails;
import Springboot_App.SpringBoot.Fundamental_R.studentBean.AllAccount;
import Springboot_App.SpringBoot.Fundamental_R.studentBean.bankTransacton;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    // again creating the to return the different details
    @GetMapping("/shivam")
    public StudentDetails shivam(){
        return new StudentDetails("my name is shivam singh " , 242211017 ,"satyendra kumar singh " ,"sarita singh ") ;
    }
    // this is the new api

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

    // creating the api with the query parameter
    // creating the method of the values
    @GetMapping("/StudentMapping/query")
    public StudentDetails DynamicObject(@RequestParam int id ,
                                        @RequestParam String name ,
                                        @RequestParam String fatherName ){

    }





}
