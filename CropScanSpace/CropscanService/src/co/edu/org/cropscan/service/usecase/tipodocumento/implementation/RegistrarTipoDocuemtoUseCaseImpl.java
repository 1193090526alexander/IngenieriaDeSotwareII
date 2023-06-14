package co.edu.org.cropscan.service.usecase.tipodocumento.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.org.cropscan.entity.TipoDocumentoEntity;
import co.edu.org.cropscan.repository.TipoDocumentoRepository;
import co.edu.org.cropscan.service.assembler.ModelMapper;
import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;
import co.edu.org.cropscan.service.usecase.tipodocumento.RegistrarTipoDocuemntoUseCase;

@Service
public class RegistrarTipoDocuemtoUseCaseImpl implements RegistrarTipoDocuemntoUseCase {

	
	@Autowired
	private final TipoDocumentoRepository repository;
	
	private final ModelMapper<TipoDocumentoDomain, TipoDocumentoEntity> modelmapper;
		
	public RegistrarTipoDocuemtoUseCaseImpl(TipoDocumentoRepository repository, ModelMapper<TipoDocumentoDomain, TipoDocumentoEntity> modelmapper) {
        this.repository = repository;
        this.modelmapper = modelmapper;
    }
	@Override
	public void execute(TipoDocumentoDomain domain) {
		
		//crear las reglas de negocio
		//specification pattern o un validator pattern
		//Aqui deberas crear el ensamblador
		
		TipoDocumentoEntity entity = null;
		repository.save(entity);
	}
}	
