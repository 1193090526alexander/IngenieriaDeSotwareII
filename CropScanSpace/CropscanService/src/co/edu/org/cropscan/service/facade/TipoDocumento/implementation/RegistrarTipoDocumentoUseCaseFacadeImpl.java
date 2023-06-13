package co.edu.org.cropscan.service.facade.TipoDocumento.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.org.cropscan.dto.TipoDocumentoDTO;
import co.edu.org.cropscan.dto.UsuarioDTO;
import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;
import co.edu.org.cropscan.service.domain.UsuarioDomain;
import co.edu.org.cropscan.service.facade.TipoDocumento.RegistrarTipoDocumentoUseCaseFacade;
import co.edu.org.cropscan.service.facade.usuario.RegistrarUsuarioUseCaseFacade;
import co.edu.org.cropscan.service.usecase.tipodocumento.RegistrarTipoDocuemntoUseCase;

@Service
@Transactional
public class RegistrarTipoDocumentoUseCaseFacadeImpl implements RegistrarTipoDocumentoUseCaseFacade{
	
	@Autowired
	private RegistrarTipoDocuemntoUseCase usecase;

	@Override
	public void execute(TipoDocumentoDTO dto) {
		//Sirve el asembler para llevar de DTO a Domain
		TipoDocumentoDomain domain = null;
	usecase.execute(domain);	
	}





}
