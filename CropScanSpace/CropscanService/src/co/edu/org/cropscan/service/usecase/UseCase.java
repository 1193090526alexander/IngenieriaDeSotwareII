package co.edu.org.cropscan.service.usecase;

public interface UseCase<D> {
	
	void execute (D domain);

}
