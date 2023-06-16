package co.edu.org.cropscan.service.assembler.finca;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

import co.edu.org.cropscan.dto.FincaDTO;
import co.edu.org.cropscan.service.domain.FincaDomain;

@Configuration
public class FincaAssemblerDTO implements co.edu.org.cropscan.service.assembler.ModelMapperDTO<FincaDTO, FincaDomain>{

	private  final ModelMapper modelMapper;
	
	public FincaAssemblerDTO() {
		this.modelMapper = new ModelMapper();
	}
	@Override
	public FincaDomain assembleDomain(FincaDTO dto) {
		return modelMapper.map(dto, FincaDomain.class);
	}
	@Override
	public FincaDTO assembleDTO(FincaDomain domain) {
		return modelMapper.map(domain, FincaDTO.class);
	
	}
}