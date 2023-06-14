package co.edu.org.cropscan.api.controller.tipodocuemnto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.org.cropscan.dto.TipoDocumentoDTO;
import co.edu.org.cropscan.service.facade.TipoDocumento.RegistrarTipoDocumentoUseCaseFacade;

@RestController
@RequestMapping("cropscan/api/v1/tipodocumento")
public class RegistrarTipoDocumentoController {
	
	@Autowired
	private RegistrarTipoDocumentoUseCaseFacade facade;

	@PostMapping
	public ResponseEntity<String> execute(@RequestBody TipoDocumentoDTO tipodocuemnto){
		facade.execute(tipodocuemnto);
		return new ResponseEntity<>("Éxito", HttpStatus.ACCEPTED);
		
	}
}
