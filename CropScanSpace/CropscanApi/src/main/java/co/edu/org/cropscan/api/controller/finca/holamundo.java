package co.edu.org.cropscan.api.controller.finca;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mundo")
@Controller
public class holamundo {
	

    @GetMapping
    public String helloWorld() {
        return "¡Hola mundo!";
    }

}
