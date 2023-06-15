package co.edu.org.cropscan.service.assembler.tipodocumento;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.edu.org.cropscan.dto.TipoDocumentoDTO;
import co.edu.org.cropscan.entity.TipoDocumentoEntity;
import co.edu.org.cropscan.service.assembler.ModelMapperDTO;
import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;
@Configuration
public class TipoDocumentoAssembler implements co.edu.org.cropscan.service.assembler.ModelMapper<TipoDocumentoDomain, TipoDocumentoEntity>, ModelMapperDTO<TipoDocumentoDTO, TipoDocumentoDomain>{

	
	ModelMapper mapper = new ModelMapper ();
		
	
	@Override
	public TipoDocumentoEntity AssemblerDomain(TipoDocumentoDomain domain) {
		return mapper.map(domain, TipoDocumentoEntity.class);
	}
	
	@Override
	public TipoDocumentoDomain AssemberEntity(TipoDocumentoEntity entity) {
		return mapper.map(entity, TipoDocumentoDomain.class);
	}
	
	@Override
	public TipoDocumentoDTO AssemblerDTO(TipoDocumentoDomain domain) {
		return mapper.map(domain, TipoDocumentoDTO.class);
	}
	
	@Override
	public TipoDocumentoDomain AssemblerDomaintoDto(TipoDocumentoDTO dto) {
		return mapper.map(dto, TipoDocumentoDomain.class);
	}
}
