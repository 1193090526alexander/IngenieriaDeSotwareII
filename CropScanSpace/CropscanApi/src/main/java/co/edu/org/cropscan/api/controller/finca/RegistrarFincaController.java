package co.edu.org.cropscan.api.controller.finca;

import java.util.ArrayList;

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

import co.edu.org.cropscan.api.response.Response;
import co.edu.org.cropscan.api.response.dto.Message;
import co.edu.org.cropscan.crosscutting.exception.CropscanCropscanException;
import co.edu.org.cropscan.crosscutting.exception.utilidades.UtilObject;
import co.edu.org.cropscan.dto.FincaDTO;
import co.edu.org.cropscan.service.facade.finca.RegistrarFincaUseCaseFacade;
import co.edu.org.cropscan.service.port.MailPort;


@CrossOrigin (origins = "http://localhost:8088")
@RestController
@RequestMapping("/cropscan/api/v1/finca")
public class RegistrarFincaController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MailPort mailPort;
	
	@Autowired
	private RegistrarFincaUseCaseFacade facade;
	

    @PostMapping
    public ResponseEntity<Response<FincaDTO>>  createCity(@RequestBody FincaDTO finca){
        Response<FincaDTO> response = new Response<>();
        ResponseEntity<Response<FincaDTO>> responseEntity;
        HttpStatus httpStatus = HttpStatus.CREATED;
        response.setData(new ArrayList<>());
        try {
            facade.execute(finca);
            response.addData(finca);
            response.addMessage(Message.createSuccessMessage("finca registrada", "La finca fue registrada"));
            log.info("City register succesfully");
            mailPort.sendMail("Finca registrada " , "elmerp1193090526@gmail.com", "La finca ha sido registrada correctamente");
        } catch (CropscanCropscanException exception) {
            httpStatus = HttpStatus.BAD_REQUEST;
            response.addMessage(Message.createErrorMessage(exception.getUserMessage(), "Error al crear la finca"));
            if (!UtilObject.isNull(exception.getCause())
                    && exception.isTechnicalException()) {
                response.addMessage(Message.createErrorMessage(exception.getMessage(),"Mensaje tecnico"));
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


