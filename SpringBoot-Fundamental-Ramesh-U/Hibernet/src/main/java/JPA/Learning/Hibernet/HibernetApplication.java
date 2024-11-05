package JPA.Learning.Hibernet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernetApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HibernetApplication.class, args);
	}


	// second method for the run
	@Override
	public void run(String... args) throws Exception {

	}
}
