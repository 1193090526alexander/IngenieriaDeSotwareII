package co.edu.org.cropscan.service.facade;

public interface UseCaseFacade<T> {
	
	void execute (T dto);

}
