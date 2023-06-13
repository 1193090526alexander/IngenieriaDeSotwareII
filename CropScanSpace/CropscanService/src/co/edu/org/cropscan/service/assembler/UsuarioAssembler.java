package co.edu.org.cropscan.service.assembler;

import org.modelmapper.ModelMapper;


import co.edu.org.cropscan.dto.UsuarioDTO;
import co.edu.org.cropscan.entity.UsuarioEntity;
import co.edu.org.cropscan.service.domain.UsuarioDomain;

public class UsuarioAssembler {
	
	ModelMapper mapper = new ModelMapper ();
	
	public UsuarioDomain todomain (UsuarioDTO dto){
		return mapper.map(dto, UsuarioDomain.class);
	}
	public UsuarioEntity toentity (UsuarioDomain domain){
		return mapper.map(domain , UsuarioEntity.class);
	}
	public UsuarioDomain todo (UsuarioEntity entity){
		return mapper.map(entity, UsuarioDomain.class);
	}

}
