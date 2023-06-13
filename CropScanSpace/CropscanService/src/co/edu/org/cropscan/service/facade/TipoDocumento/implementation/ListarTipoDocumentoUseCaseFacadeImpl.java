package co.edu.org.cropscan.service.facade.TipoDocumento.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.org.cropscan.dto.UsuarioDTO;
import co.edu.org.cropscan.service.facade.usuario.ListarUsuariosUseCaseFacade;
import co.edu.org.cropscan.service.usecase.usuario.ListarUsuarioUseCase;
import co.edu.org.cropscan.service.usecase.usuario.RegistrarUsuarioUseCase;

@Service
@Transactional
public class ListarTipoDocumentoUseCaseFacadeImpl implements ListarUsuariosUseCaseFacade{

	@Autowired
	private ListarUsuarioUseCase usecase;
	@Override
	public List<UsuarioDTO> execute(Optional<UsuarioDTO> dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
