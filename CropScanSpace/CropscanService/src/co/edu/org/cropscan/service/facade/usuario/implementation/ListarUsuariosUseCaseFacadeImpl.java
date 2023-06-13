package co.edu.org.cropscan.service.facade.usuario.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.org.cropscan.dto.TipoDocumentoDTO;
import co.edu.org.cropscan.service.facade.TipoDocumento.ListarTipoDocumentoUseCaseFacade;
import co.edu.org.cropscan.service.usecase.tipodocumento.ListarTipoDocumentoUseCase;
@Service
@Transactional
public class ListarUsuariosUseCaseFacadeImpl implements ListarTipoDocumentoUseCaseFacade{

	@Autowired
	private ListarTipoDocumentoUseCase usecase;

	@Override
	public List<TipoDocumentoDTO> execute(Optional<TipoDocumentoDTO> dto) {
		// TODO Auto-generated method stub
		return null;
	}


}
