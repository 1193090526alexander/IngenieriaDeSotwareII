package co.edu.org.cropscan.service.usecase.finca.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.org.cropscan.repository.TipoDocumentoRepository;
import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.service.usecase.finca.ListarFincaUseCase;

@Service
public class ListarFincaUseCasesImpl implements ListarFincaUseCase {

	@Autowired
	private TipoDocumentoRepository repository;

	@Override
	public List<FincaDomain> execute(Optional<FincaDomain> domain) {
		// TODO Auto-generated method stub
		return null;
	}


}
