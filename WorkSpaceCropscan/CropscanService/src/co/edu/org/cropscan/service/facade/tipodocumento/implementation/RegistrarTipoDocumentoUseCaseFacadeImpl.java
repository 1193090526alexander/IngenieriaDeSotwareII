package co.edu.org.cropscan.service.facade.tipodocumento.implementation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.org.cropscan.dto.TipoDocumentoDTO;
import co.edu.org.cropscan.service.facade.tipodocumento.RegistrarTipoDocumentoUseCaseFacade;


@Service
@Transactional
public class RegistrarTipoDocumentoUseCaseFacadeImpl implements RegistrarTipoDocumentoUseCaseFacade{

	@Override
	public void execute(TipoDocumentoDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
