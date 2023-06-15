package co.edu.org.cropscan.service.usecase.finca.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import co.edu.org.cropscan.entity.FincaEntity;
import co.edu.org.cropscan.repository.FincaRepository;
import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.service.usecase.finca.RegistrarFincaUseCase;

@Validated
@Service
public class RegistrarFincaUseCaseImpl implements RegistrarFincaUseCase {

	@Autowired
	private FincaRepository repository;

	@Autowired
	private ModelMapper modelMapper;
		
	@Override
	public void execute(FincaDomain domain) {
		
		FincaEntity entity = modelMapper.map(domain, FincaEntity.class);
		repository.save(entity);
		modelMapper.map(entity, FincaDomain.class);	
	}
}	

