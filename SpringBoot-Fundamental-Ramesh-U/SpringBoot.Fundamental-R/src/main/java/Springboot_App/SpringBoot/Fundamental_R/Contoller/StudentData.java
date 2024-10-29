package Springboot_App.SpringBoot.Fundamental_R.Contoller;

import Springboot_App.SpringBoot.Fundamental_R.bean.StudentDetails;
import Springboot_App.SpringBoot.Fundamental_R.studentBean.AllAccount;
import Springboot_App.SpringBoot.Fundamental_R.studentBean.bankTransacton;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public  StudentDetails studentDetails(){
        return new StudentDetails("shvam singh " , 3434 , "satyendra kumar singh " , "sarita singh ") ;
    }

    // this api creating the two method using the response entity
    @GetMapping("/studentDetails/Response")
    public ResponseEntity<StudentDetails> studentDetailsResponse(){
        StudentDetails studentDetails = new StudentDetails("shvam singh " , 3434 , "satyendra kumar singh " , "sarita singh ") ;
        return new ResponseEntity<>(studentDetails , HttpStatus.OK) ;
    }

    // learning the another method for the using
    @GetMapping("/studentDetails/Response/Tpye")
    public ResponseEntity<StudentDetails> studentDetailsResponseSecondMethod(){
        StudentDetails studentDetails = new StudentDetails("shvam singh " , 3434 , "satyendra kumar singh " , "sarita singh ") ;
        return ResponseEntity.ok(studentDetails) ;
    }

    // also you are the using return the with header
    // creating the same method for the return with header method
    @GetMapping("/studentDetails/Response/Tpyes")
    public ResponseEntity<StudentDetails> studentDetailsResponseSecondMethodWithHeader(){
        StudentDetails studentDetails = new StudentDetails("shvam singh " , 3434 , "satyendra kumar singh " , "sarita singh ") ;
        return ResponseEntity.ok().header("testAPI","test").body(studentDetails) ;
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

    // CREATING THE LIST as the response
    @GetMapping("/allStudent/Response/e")
    public ResponseEntity<List<StudentDetails>> AllStudentDataResponseE(){

        // creating the list and adding the all the data in the list
        List<StudentDetails>AllStudent = new ArrayList<>() ;
        // creating the object of the class and the adding in the list
        AllStudent.add(new StudentDetails("shivam" , 3443 , "satyendra kumar singh " , "sarita singh ")) ;
        AllStudent.add(new StudentDetails("anuj singh " , 4354675 , "rb singh " , "geeta signh")) ;
        AllStudent.add(new StudentDetails("lovely singh " , 8369 , "taj singh " , "mata rani")) ;
        return ResponseEntity.ok(AllStudent) ;
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
    //http://localhost:8080/StudentMapping/query?id=1&name=%22shivam%20singh%20%22&fatherName=%22satyendra%20kumar%20singh%22
    @GetMapping("/StudentMapping/query")
    public StudentDetails DynamicObject(@RequestParam int id ,
                                        @RequestParam String name ,
                                        @RequestParam String fatherName ){

        // creating the object of the student details
        return new StudentDetails(name , id , fatherName , "sarita singh ");

    }

    // now learning the post mapping the @postmapping and @requestBody
    // now we are the solving the post mapping directly convert to json
    @PostMapping("Student/updating")
    @ResponseStatus(HttpStatus.CREATED)
    public StudentDetails addDetails(@RequestBody StudentDetails details){
        // now printing all the details
        // and the return all the

        // @ResponseStatus(HttpStatus.CREATED) // that are the using
        System.out.println(details.getFatherName());
        System.out.println(details.getMotherName());
        System.out.println(details.getName());
        System.out.println(details.getRollNo());
        return details ;
    }

    // now we are the learning the put request for the updating something in the field
    // creating the put request
    @PutMapping("student/{id}/postData") // forgot to use @request body
    @ResponseStatus(HttpStatus.CREATED)
    public StudentDetails UpdatingStudent(@RequestBody StudentDetails details , @PathVariable("id") int StudentId){

        // now printing the name and father name and the mother name
        System.out.println(details.getName());
        System.out.println(details.getFatherName());
        return  details ;
    }

    // creating the  handel the delete request which are the existing resource
    @DeleteMapping("student/{id}/deleted")
    public  String deleteMapping(@PathVariable("id") int student){
        System.out.print(student);
        return "successfully deleted values " ;
    }


    // now learning the response entity class







}
