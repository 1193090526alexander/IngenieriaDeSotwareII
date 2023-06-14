package co.edu.org.cropscan.service.assembler;

public interface ModelMapper<D,E> {
	
	
	E AssemblerDomain(D domain);
	D AssemberEntity(E entity);
	

}
