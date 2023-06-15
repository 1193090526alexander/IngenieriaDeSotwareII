package co.edu.org.cropscan.service.usecase.usuario.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import co.edu.org.cropscan.entity.FincaEntity;
import co.edu.org.cropscan.entity.TipoDocumentoEntity;
import co.edu.org.cropscan.entity.UsuarioEntity;
import co.edu.org.cropscan.repository.FincaRepository;
import co.edu.org.cropscan.repository.TipoDocumentoRepository;
import co.edu.org.cropscan.repository.UsuarioRepository;

import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;
import co.edu.org.cropscan.service.domain.UsuarioDomain;
import co.edu.org.cropscan.service.usecase.finca.RegistrarFincaUseCase;
import co.edu.org.cropscan.service.usecase.tipodocumento.RegistrarTipoDocuemntoUseCase;
import co.edu.org.cropscan.service.usecase.usuario.RegistrarUsuarioUseCase;
import jakarta.validation.Valid;

@Service
@Validated
public class RegistrarUsuarioUseCaseImpl implements RegistrarUsuarioUseCase {

	@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public void execute( @Valid UsuarioDomain domain) {
		try {
			UsuarioEntity entity = modelMapper.map(domain, UsuarioEntity.class);
			repository.save(entity);
			
		} catch (Exception e) {
			System.out.println("");
		}
		//crear las reglas de negocio
		//specification pattern o un validator pattern
		
		
		
	}
}	