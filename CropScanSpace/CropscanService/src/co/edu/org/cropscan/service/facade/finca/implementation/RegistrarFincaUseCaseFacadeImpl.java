package co.edu.org.cropscan.service.facade.finca.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.org.cropscan.dto.FincaDTO;
import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;
import co.edu.org.cropscan.service.facade.finca.RegistrarFincaUseCaseFacade;
import co.edu.org.cropscan.service.usecase.finca.RegistrarFincaUseCase;

@Service
@Transactional
public class RegistrarFincaUseCaseFacadeImpl implements RegistrarFincaUseCaseFacade{
	
	@Autowired
	private RegistrarFincaUseCase usecase;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public void execute(FincaDTO dto) {
		FincaDomain domain = modelMapper.map(dto, FincaDomain.class);
		usecase.execute(domain);
		
	}





}
