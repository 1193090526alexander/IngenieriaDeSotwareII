package co.edu.org.cropscan.api.controller.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.org.cropscan.dto.UsuarioDTO;
import co.edu.org.cropscan.service.facade.usuario.RegistrarUsuarioUseCaseFacade;

@RestController
@RequestMapping("cropscan/api/v1/usuario")
public class RegistrarUsuarioController {
	
	@Autowired
	private RegistrarUsuarioUseCaseFacade facade;

	@PostMapping
	public ResponseEntity<String> execute(@RequestBody UsuarioDTO usuario){
		facade.execute(usuario);
		return new ResponseEntity<>("Éxito", HttpStatus.ACCEPTED);
		
	}
}
