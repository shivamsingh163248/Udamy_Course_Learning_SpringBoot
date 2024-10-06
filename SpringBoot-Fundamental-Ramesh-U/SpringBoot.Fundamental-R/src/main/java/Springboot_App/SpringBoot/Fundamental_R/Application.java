package Springboot_App.SpringBoot.Fundamental_R;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	 ApplicationContext applicationContext =  SpringApplication.run(Application.class, args);

	  // creating the arrays and testing all the print
		// application interface is the
		String[] bean = applicationContext.getBeanDefinitionNames() ;
		// creating the for leach loop
		for(String beans :bean){
			System.out.println(bean);
		}

	}

}
