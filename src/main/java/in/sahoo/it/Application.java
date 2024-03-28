package in.sahoo.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
 	ConfigurableApplicationContext context=	SpringApplication.run(Application.class, args);
 	int i=10;
 	System.out.println(i);
 	context.close();
	}

}
