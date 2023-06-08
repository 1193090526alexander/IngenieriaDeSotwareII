package co.edu.org.cropscan.service.usecase.tipodocumento.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.org.cropscan.entity.TipoDocumentoEntity;
import co.edu.org.cropscan.repository.TipoDocumentoRepository;
import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;
import co.edu.org.cropscan.service.usecase.tipodocumento.RegistrarTipoDocumentoUseCase;

@Service
public class RegistarTipoDocuementoUseCaseImpl implements RegistrarTipoDocumentoUseCase {

	@Autowired
	private TipoDocumentoRepository repository;
	
	@Override
	public void execute(TipoDocumentoDomain domain) {
		//crear las reglas de negocio
		//Specification pattern o un validator pattern
		
		// Aqui deberas crear el emsamblador
		TipoDocumentoEntity entity = null;
		repository.save(entity);
		
	}

}
