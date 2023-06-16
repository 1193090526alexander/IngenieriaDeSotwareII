package co.edu.org.cropscan.service.assembler.finca;

import org.modelmapper.ModelMapper;

import co.edu.org.cropscan.entity.FincaEntity;
import co.edu.org.cropscan.service.domain.FincaDomain;

public class FincaAssemblerEntity implements co.edu.org.cropscan.service.assembler.ModelMapper <FincaEntity, FincaDomain>{

	
	private  final ModelMapper modelMapper;
	
	public FincaAssemblerEntity() {
		this.modelMapper = new ModelMapper();
	
	}
	@Override
	public FincaDomain assembleDomain(FincaEntity entity) {
		return modelMapper.map(entity, FincaDomain.class);
	}

	@Override
	public FincaEntity assembleEntity(FincaDomain domain) {
		return modelMapper.map(domain, FincaEntity.class);
	}

}
