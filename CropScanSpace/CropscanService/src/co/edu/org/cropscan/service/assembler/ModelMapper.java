 package co.edu.org.cropscan.service.assembler;
import org.springframework.stereotype.Component;

@Component
public interface ModelMapper<E ,D> {
	
	
    D assembleDomain(E entity);
    E assembleEntity(D domain);
	

}
