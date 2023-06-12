package co.edu.org.cropscan.api.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("/co.edu.org.cropscan.entity")
public class CropscanApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropscanApiApplication.class, args);
	}

}
