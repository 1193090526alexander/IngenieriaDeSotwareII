package co.edu.org.cropscan.service.usecase.usuario.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.org.cropscan.repository.UsuarioRepository;
import co.edu.org.cropscan.service.domain.UsuarioDomain;

import co.edu.org.cropscan.service.usecase.usuario.ListarUsuarioUseCase;

@Service
public class ListarUsuarioUseCasesImpl implements ListarUsuarioUseCase {

	@Autowired
	private UsuarioRepository repository;

	@Override
	public List<UsuarioDomain> execute(Optional<UsuarioDomain> domain) {
		// TODO Auto-generated method stub
		return null;
	}






}
