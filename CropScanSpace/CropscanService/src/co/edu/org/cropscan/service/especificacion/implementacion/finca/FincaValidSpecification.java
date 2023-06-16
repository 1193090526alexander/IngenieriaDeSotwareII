package co.edu.org.cropscan.service.especificacion.implementacion.finca;

import co.edu.org.cropscan.crosscutting.exception.ServiceCropscanException;
import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.crosscutting.exception.ServiceCropscanException;
import co.edu.org.cropscan.crosscutting.exception.utilidades.UtilObject;
import co.edu.org.cropscan.crosscutting.exception.utilidades.UtilUUID;
import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.service.especificacion.CompositeSpecification;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class FincaValidSpecification extends CompositeSpecification<FincaDomain> {
    @Override
    public boolean isSatisfyBy(FincaDomain fincaDomain) {
        return isValidId(fincaDomain);
    }

    private boolean isValidId(FincaDomain fincaDomain) {
        if (UtilObject.isNull(FincaDomain.getNit()) {
            throw ServiceCropscanException.createUserException("El identificador esta erroneo");
        }
        else if (UtilUUID.getUUIDAsString(FincaDomain.getNit()).length() != 36|| Objects.equals(FincaDomain.getNit().toString(), UtilUUID.DEFAULT_UUID_AS_STRING)) {
            throw ServiceCropscanException.createUserException("Codigo invalido ");
        }
        return true;
    }
}
