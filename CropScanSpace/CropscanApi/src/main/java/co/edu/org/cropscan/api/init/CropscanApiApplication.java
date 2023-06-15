package co.edu.org.cropscan.api.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"co.edu.org.cropscan"})
@EnableJpaRepositories(basePackages = {"co.edu.org.cropscan" })
@EntityScan(basePackages = {"co.edu.org.cropscan" })
@ComponentScan(basePackages = "co.edu.org.cropscan.service.assembler")
@ComponentScan("co.edu.org.cropscan.service.domain")


public class CropscanApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropscanApiApplication.class, args);
	}

}
