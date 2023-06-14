package co.edu.org.cropscan.service.assembler.finca;

import org.modelmapper.ModelMapper;

import co.edu.org.cropscan.dto.FincaDTO;
import co.edu.org.cropscan.entity.FincaEntity;
import co.edu.org.cropscan.service.assembler.ModelMapperDTO;
import co.edu.org.cropscan.service.domain.FincaDomain;


public class FincaAssembler implements co.edu.org.cropscan.service.assembler.ModelMapper<FincaDomain, FincaEntity>, ModelMapperDTO<FincaDTO, FincaDomain> {

	ModelMapper mapper = new ModelMapper ();
	
	@Override
	public FincaDTO AssemblerDTO(FincaDomain domain) {
		return mapper.map(domain, FincaDTO.class);
	}

	@Override
	public FincaDomain AssemblerDomaintoDto(FincaDTO dto) {
		return mapper.map(dto, FincaDomain.class);
	}

	@Override
	public FincaEntity AssemblerDomain(FincaDomain domain) {
		return mapper.map(domain, FincaEntity.class);
	}

	@Override
	public FincaDomain AssemberEntity(FincaEntity entity) {
		return mapper.map(entity, FincaDomain.class);
	}

}
