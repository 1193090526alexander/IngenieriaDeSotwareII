package co.edu.org.cropscan.service.assembler.usuario;

import org.modelmapper.ModelMapper;


import co.edu.org.cropscan.dto.UsuarioDTO;
import co.edu.org.cropscan.entity.UsuarioEntity;
import co.edu.org.cropscan.service.assembler.ModelMapperDTO;
import co.edu.org.cropscan.service.domain.UsuarioDomain;

public class UsuarioAssembler implements co.edu.org.cropscan.service.assembler.ModelMapper<UsuarioDomain, UsuarioEntity>, ModelMapperDTO<UsuarioDTO, UsuarioDomain> {
	
	ModelMapper mapper = new ModelMapper ();
	
	@Override
	public UsuarioDTO AssemblerDTO(UsuarioDomain domain) {
		return mapper.map(domain, UsuarioDTO.class);
	}
	@Override
	public UsuarioDomain AssemblerDomaintoDto(UsuarioDTO dto) {
		return mapper.map(dto, UsuarioDomain.class);
	}
	@Override
	public UsuarioEntity AssemblerDomain(UsuarioDomain domain) {
		return mapper.map(domain, UsuarioEntity.class);
	}
	@Override
	public UsuarioDomain AssemberEntity(UsuarioEntity entity) {
		return mapper.map(entity, UsuarioDomain.class);
	}

}
