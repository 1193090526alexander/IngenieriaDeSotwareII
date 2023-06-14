package co.edu.org.cropscan.service.usecase.finca.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.org.cropscan.entity.FincaEntity;
import co.edu.org.cropscan.entity.TipoDocumentoEntity;
import co.edu.org.cropscan.repository.FincaRepository;
import co.edu.org.cropscan.repository.TipoDocumentoRepository;
import co.edu.org.cropscan.service.assembler.ModelMapper;
import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;
import co.edu.org.cropscan.service.usecase.finca.RegistrarFincaUseCase;
import co.edu.org.cropscan.service.usecase.tipodocumento.RegistrarTipoDocuemntoUseCase;

@Service
public class RegistrarFincaUseCaseImpl implements RegistrarFincaUseCase {

	@Autowired
	private FincaRepository repository;
	
	private final ModelMapper<FincaDomain, FincaEntity> modelmapper;
	
	public RegistrarFincaUseCaseImpl(FincaRepository repository, ModelMapper<FincaDomain, FincaEntity> modelmapper) {
        this.repository = repository;
        this.modelmapper = modelmapper;
	}
	@Override
	public void execute(FincaDomain domain) {
		
		//crear las reglas de negocio
		//specification pattern o un validator pattern
		//Aqui deberas crear el ensamblador
		
		FincaEntity entity = null;
		repository.save(entity);
	}
}	

