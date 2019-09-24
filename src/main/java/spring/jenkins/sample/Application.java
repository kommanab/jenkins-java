package spring.jenkins.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		}
	
	@RequestMapping("/")
	public String status(){
		return "Spring Jenkins is UP";
	}
   public void test()	 {
	   String name = "Naga Bharath Reddy Komma";
	   System.out.println("Added fcode for jenkins");
   }
	
}
