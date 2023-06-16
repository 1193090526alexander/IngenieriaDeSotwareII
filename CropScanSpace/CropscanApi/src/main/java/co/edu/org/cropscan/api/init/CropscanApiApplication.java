package co.edu.org.cropscan.api.init;

import com.azure.security.keyvault.secrets.SecretClient;
import com.microsoft.applicationinsights.attach.ApplicationInsights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.org.cropscan"})
@EnableJpaRepositories(basePackages = {"co.edu.org.cropscan" })
@EntityScan(basePackages = {"co.edu.org.cropscan" })
public class CropscanApiApplication {

    @Autowired
    private SecretClient secretClient;


    public static void main(String[] args) {
        ApplicationInsights.attach();
        SpringApplication.run(CropscanApiApplication.class, args);
    }

}
