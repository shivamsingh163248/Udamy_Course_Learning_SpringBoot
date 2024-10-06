package Springboot_App.SpringBoot.Fundamental_R.Contoller;

// using the controller annotation and ResponseBody to switch into in the RestController

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFristApi {

    // creating the first api
    // creating the method for the printing to print the string
    //@using the get mapping the request to mapping the url
    @GetMapping("/TestApi")
    public  String Test(){
        return "this is the my First api" ;
    }
}
