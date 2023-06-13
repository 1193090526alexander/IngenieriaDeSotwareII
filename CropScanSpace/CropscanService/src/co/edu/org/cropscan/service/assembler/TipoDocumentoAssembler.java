package co.edu.org.cropscan.service.assembler;

import org.modelmapper.ModelMapper;

import co.edu.org.cropscan.dto.TipoDocumentoDTO;
import co.edu.org.cropscan.entity.TipoDocumentoEntity;
import co.edu.org.cropscan.service.domain.TipoDocumentoDomain;

public class TipoDocumentoAssembler {

	ModelMapper mapper = new ModelMapper ();
	
	public TipoDocumentoDomain todomain (TipoDocumentoDTO dto){
		return mapper.map(dto, TipoDocumentoDomain.class);
	}	
	public TipoDocumentoEntity toentity (TipoDocumentoDomain domain){
		return mapper.map(domain, TipoDocumentoEntity.class);
	}
	public TipoDocumentoDomain todo (TipoDocumentoEntity entity){
		return mapper.map(entity, TipoDocumentoDomain.class);	
	}
}
