package co.edu.org.cropscan.api.controller.finca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.org.cropscan.dto.FincaDTO;
import co.edu.org.cropscan.service.facade.finca.RegistrarFincaUseCaseFacade;

@RestController
@RequestMapping("cropscan/api/v1/finca")
public class RegistrarFincaController {
	
	@Autowired
	private RegistrarFincaUseCaseFacade facade;
	

	@PostMapping
	public ResponseEntity<String> execute(@RequestBody FincaDTO finca){
		facade.execute(finca);
		return new ResponseEntity<>("Éxito", HttpStatus.ACCEPTED);
		
	}

}
