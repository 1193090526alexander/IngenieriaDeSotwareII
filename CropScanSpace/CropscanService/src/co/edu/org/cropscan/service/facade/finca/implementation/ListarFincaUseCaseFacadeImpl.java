package co.edu.org.cropscan.service.facade.finca.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import co.edu.org.cropscan.dto.FincaDTO;
import co.edu.org.cropscan.service.facade.finca.ListarFincaUseCaseFacade;
import co.edu.org.cropscan.service.usecase.finca.ListarFincaUseCase;

@Service
@Transactional
public class ListarFincaUseCaseFacadeImpl implements ListarFincaUseCaseFacade{

	@Autowired
	private ListarFincaUseCase usecase;

	@Override
	public List<FincaDTO> execute(Optional<FincaDTO> dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
