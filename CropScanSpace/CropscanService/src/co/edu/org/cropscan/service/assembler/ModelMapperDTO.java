package co.edu.org.cropscan.service.assembler;

public interface ModelMapperDTO<T, D> {
	
	T AssemblerDTO(D domain);
	D AssemblerDomaintoDto(T dto);

}
