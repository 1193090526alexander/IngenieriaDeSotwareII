package co.edu.org.cropscan.api.controller.finca;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.org.cropscan.dto.FincaDTO;
import co.edu.org.cropscan.service.facade.finca.RegistrarFincaUseCaseFacade;

@CrossOrigin (Origin = "http://localhost:8088")
@RestController
@RequestMapping("/cropscan/api/v1/finca")
public class RegistrarFincaController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MailPort mailPort;
	
	@Autowired
	private RegistrarFincaUseCaseFacade facade;
	

	@PostMapping
	public ResponseEntity<Response<FincaDTO> createFinca(@RequestBody FincaDTO finca){
		Response<FincaDTO> response = new Response <>();
		ResponseEntity<Response<FincaDTO>> responseEntity;
		HttpStatus httpStatus = HttpStatus.CREATED;
		response.setData(new ArrayList<>());
		try {
			facade.execute(finca);
			response.addData(finca);
			response.addMessage(Message.createSuccesMessage("Finca registrada","La finca fue registrada correctamente"));
			log.info("Ciudad Registrada");
			mailPort.sendMail("Finca registrada correctamente","elmerp1193090526@gmail.com","La finca fue registrada correctamente");
		} catch (CropScanCustomException exception){
			httpStatus = HttpStatus.BAD_REQUEST;
			response.addMessage(Message.createErrorMessage(exception.getUserMessage(), "Se encontro un error creando la finca"));
            if (!UtilObject.isNull(exception.getCause())
                    && exception.isTechnicalException()) {
                response.addMessage(Message.createErrorMessage(exception.getMessage(),"Technical Message"));
            }
		} catch (Exception exception) {
            httpStatus = HttpStatus.BAD_REQUEST;
            response.addMessage(Message.createFatalMessage(exception.getMessage(), "Error inesperado"));
            log.error(exception.getMessage());
        }
        responseEntity = new ResponseEntity<Response<FincaDTO>>(response,httpStatus);
        return responseEntity;
    }
}



