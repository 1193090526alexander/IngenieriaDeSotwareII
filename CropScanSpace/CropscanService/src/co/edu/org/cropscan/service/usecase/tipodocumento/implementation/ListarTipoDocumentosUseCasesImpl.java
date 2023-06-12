package co.edu.org.cropscan.service.usecase.tipodocumento.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.org.cropscan.repository.TipoDocumentoRepository;
import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;
import co.edu.org.cropscan.service.usecase.tipodocumento.ListarTipoDocumentoUseCase;

@Service
public class ListarTipoDocumentosUseCasesImpl implements ListarTipoDocumentoUseCase {

	@Autowired
	private TipoDocumentoRepository repository;
	
	@Override
	public List<TipoDocumentoDomain> execute(Optional<TipoDocumentoDomain> domain) {
		// TODO Auto-generated method stub
		return null;
	}

}
