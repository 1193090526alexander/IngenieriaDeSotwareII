package co.edu.org.cropscan.service.usecase.tipodocumento.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.org.cropscan.entity.TipoDocumentoEntity;
import co.edu.org.cropscan.repository.TipoDocumentoRepository;
import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;
import co.edu.org.cropscan.service.usecase.tipodocumento.RegistrarTipoDocuemntoUseCase;

@Service
public class RegistrarTipoDocuemtoUseCaseImpl implements RegistrarTipoDocuemntoUseCase {

	@Autowired
	private TipoDocumentoRepository repository;
	
	@Override
	public void execute(TipoDocumentoDomain domain) {
		
		//crear las reglas de negocio
		//specification pattern o un validator pattern
		//Aqui deberas crear el ensamblador
		
		TipoDocumentoEntity entity = null;
		repository.save(entity);
	}
}	
