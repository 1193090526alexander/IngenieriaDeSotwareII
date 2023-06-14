package co.edu.org.cropscan.service.usecase.usuario.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.org.cropscan.entity.FincaEntity;
import co.edu.org.cropscan.entity.TipoDocumentoEntity;
import co.edu.org.cropscan.entity.UsuarioEntity;
import co.edu.org.cropscan.repository.FincaRepository;
import co.edu.org.cropscan.repository.TipoDocumentoRepository;
import co.edu.org.cropscan.repository.UsuarioRepository;
import co.edu.org.cropscan.service.assembler.ModelMapper;
import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;
import co.edu.org.cropscan.service.domain.UsuarioDomain;
import co.edu.org.cropscan.service.usecase.finca.RegistrarFincaUseCase;
import co.edu.org.cropscan.service.usecase.tipodocumento.RegistrarTipoDocuemntoUseCase;
import co.edu.org.cropscan.service.usecase.usuario.RegistrarUsuarioUseCase;

@Service
public class RegistrarUsuarioUseCaseImpl implements RegistrarUsuarioUseCase {

	@Autowired
	private UsuarioRepository repository;
	
	private final ModelMapper<UsuarioDomain, UsuarioEntity> modelmapper;
	
	public RegistrarUsuarioUseCaseImpl(UsuarioRepository repository, ModelMapper<UsuarioDomain, UsuarioEntity> modelmapper) {
        this.repository = repository;
        this.modelmapper = modelmapper;
	}
	@Override
	public void execute(UsuarioDomain domain) {
		
		//crear las reglas de negocio
		//specification pattern o un validator pattern
		//Aqui deberas crear el ensamblado
		
		UsuarioEntity entity = null;
		repository.save(entity);
	}
}	