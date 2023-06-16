package co.edu.org.cropscan.service.assembler;

public interface ModelMapperDTO<T, D> {
	
    D assembleDomain(T dto);
    T assembleDTO(D domain);

}
