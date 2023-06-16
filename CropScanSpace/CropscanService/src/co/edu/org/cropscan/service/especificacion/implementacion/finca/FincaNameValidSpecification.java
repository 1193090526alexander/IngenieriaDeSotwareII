package co.edu.org.cropscan.service.especificacion.implementacion.finca;

import co.edu.org.cropscan.crosscutting.exception.CropscanCropscanException;
import co.edu.org.cropscan.crosscutting.exception.ServiceCropscanException;
import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.service.especificacion.CompositeSpecification;
import org.springframework.stereotype.Component;

@Component
public class  FincaNameValidSpecification extends CompositeSpecification<FincaDomain> {

    private static final Integer COUNTCHARACTER = 3;

    @Override
    public boolean isSatisfyBy(FincaDomain fincaDomain) {
        try {
            return isValidName(fincaDomain);
        } catch (CropscanCropscanException exception) {
            throw exception;
        }
    }

    private boolean isValidName(FincaDomain FincaDomain) {
        if (FincaDomain.getNombre().length() < COUNTCHARACTER) {
            throw ServiceCropscanException.createUserException("Se necesita mayor logico para de la finca");
        } else if (!FincaDomain.getNombre().matches("^[a-zA-ZñÑ\\s]+$")) {
            throw ServiceCropscanException.createUserException("No se permite usar caracteres especiales o numeros en el nombre del departamennto");
        }
        return true;
    }
}
