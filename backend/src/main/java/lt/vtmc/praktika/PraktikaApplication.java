package lt.vtmc.praktika;

//import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

//import lt.vtmc.praktika.models.ERole;
//import lt.vtmc.praktika.models.Role;
//import lt.vtmc.praktika.repository.RoleRepository;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraktikaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraktikaApplication.class, args);
	}
	@Bean(name = "mvcHandlerMappingIntrospector")
	public HandlerMappingIntrospector mvcHandlerMappingIntrospector() {
		return new HandlerMappingIntrospector();
	}

}
