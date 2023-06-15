package co.edu.org.cropscan.service.assembler;
import org.springframework.stereotype.Component;

@Component
public interface ModelMapper<D,E> {
	
	
	E AssemblerDomain(D domain);
	D AssemberEntity(E entity);
	

}
