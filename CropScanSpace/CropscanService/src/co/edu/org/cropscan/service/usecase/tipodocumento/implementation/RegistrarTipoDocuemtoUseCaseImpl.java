package co.edu.org.cropscan.service.usecase.tipodocumento.implementation;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import co.edu.org.cropscan.entity.TipoDocumentoEntity;
import co.edu.org.cropscan.repository.TipoDocumentoRepository;

import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;
import co.edu.org.cropscan.service.usecase.tipodocumento.RegistrarTipoDocuemntoUseCase;



@Service
@Validated
public class RegistrarTipoDocuemtoUseCaseImpl implements RegistrarTipoDocuemntoUseCase {

	@Autowired 
	private TipoDocumentoRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;
		
	@Override
	public void execute(TipoDocumentoDomain domain) {
		
			System.out.println( domain);
			try {
				TipoDocumentoEntity entity = modelMapper.map(domain, TipoDocumentoEntity.class);
				repository.save(entity);
				
				
			} catch (Exception e) {
				throw e;
				
			}
	
		
	}
}	
