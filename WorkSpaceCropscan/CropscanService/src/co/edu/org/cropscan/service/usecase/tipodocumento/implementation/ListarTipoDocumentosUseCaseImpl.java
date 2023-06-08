package co.edu.org.cropscan.service.usecase.tipodocumento.implementation;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import co.edu.org.cropscan.repository.TipoDocumentoRepository;
import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;
import co.edu.org.cropscan.service.usecase.tipodocumento.ListarTipoDocumentosUseCase;
@Service
public class ListarTipoDocumentosUseCaseImpl implements ListarTipoDocumentosUseCase{

	
	@Override
	public List<TipoDocumentoDomain> execute(Optional<TipoDocumentoDomain> domain) {
		// TODO Auto-generated method stub
		return null;
	}

}
