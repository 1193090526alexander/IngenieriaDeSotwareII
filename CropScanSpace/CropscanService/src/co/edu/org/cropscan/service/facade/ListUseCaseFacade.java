package co.edu.org.cropscan.service.facade;

import java.util.List;
import java.util.Optional;

public interface ListUseCaseFacade<T> {
	
	List<T> execute(Optional<T> dto);
 
}
