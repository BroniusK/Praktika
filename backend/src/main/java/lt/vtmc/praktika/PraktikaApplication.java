package lt.vtmc.praktika;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lt.vtmc.praktika.models.ERole;
import lt.vtmc.praktika.models.Role;
import lt.vtmc.praktika.repository.RoleRepository;

@SpringBootApplication
public class PraktikaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraktikaApplication.class, args);
	}
	@Bean
    public CommandLineRunner initialData(RoleRepository roleRepo) {
        return args -> {
            if(roleRepo.findByName(ERole.ROLE_USER).isEmpty()){
                roleRepo.save(new Role(ERole.ROLE_USER));
            }
            if(roleRepo.findByName(ERole.ROLE_ADMIN).isEmpty()){
                roleRepo.save(new Role(ERole.ROLE_ADMIN));
            }
        };
	}

}
