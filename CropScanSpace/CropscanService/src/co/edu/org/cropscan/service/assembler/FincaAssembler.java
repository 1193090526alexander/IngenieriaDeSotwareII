package co.edu.org.cropscan.service.assembler;

import org.modelmapper.ModelMapper;

import co.edu.org.cropscan.dto.FincaDTO;
import co.edu.org.cropscan.entity.FincaEntity;
import co.edu.org.cropscan.service.domain.FincaDomain;

public class FincaAssembler {
	
	ModelMapper mapper = new ModelMapper ();
	
	public FincaDomain todomain (FincaDTO dto){
		return mapper.map(dto, FincaDomain.class);
	}	
	public FincaEntity toentity (FincaDomain domain){
		return mapper.map(domain, FincaEntity.class);
	}
	public FincaDomain todo (FincaEntity entity){
		return mapper.map(entity, FincaDomain.class);	
	}
}
