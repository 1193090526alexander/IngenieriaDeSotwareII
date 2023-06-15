package co.edu.org.cropscan.api.controller.finca;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.org.cropscan.api.controller.sendgrid.EmailController;

@RestController
@RequestMapping("/mundo")

public class holamundo {
	

	EmailController emailcontroller= new EmailController();
    @GetMapping
    public String helloWorld() {
    	emailcontroller.sendMail();
        return "¡Hola mundo!";
    }

}
