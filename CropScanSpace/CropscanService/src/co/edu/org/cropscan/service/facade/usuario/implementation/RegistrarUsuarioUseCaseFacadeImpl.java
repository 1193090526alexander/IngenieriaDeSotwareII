package co.edu.org.cropscan.service.facade.usuario.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import co.edu.org.cropscan.dto.UsuarioDTO;
import co.edu.org.cropscan.service.domain.UsuarioDomain;
import co.edu.org.cropscan.service.facade.usuario.RegistrarUsuarioUseCaseFacade;
import co.edu.org.cropscan.service.usecase.usuario.RegistrarUsuarioUseCase;

@Service
@Transactional
public class RegistrarUsuarioUseCaseFacadeImpl implements RegistrarUsuarioUseCaseFacade{
	
	@Autowired
	private RegistrarUsuarioUseCase usecase; 

	@Override
	public void execute(UsuarioDTO dto) {
		//Sirve el asembler para llevar de DTO a Domain
		
		UsuarioDomain domain = null;
		usecase.execute(domain);	
	}

}
