package co.edu.org.cropscan.service.especificacion.implementacion.finca;

import co.edu.org.cropscan.crosscutting.exception.ServiceCropscanException;
import co.edu.org.cropscan.crosscutting.exception.ServiceCropscanException;
import co.edu.org.cropscan.crosscutting.exception.utilidades.UtilUUID;
import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.service.especificacion.CompositeSpecification;
import org.springframework.stereotype.Component;	

import java.util.Objects;

@Component
public class FincaIsNotDefaultSpecification extends CompositeSpecification<FincaDomain> {

    @Override
    public boolean isSatisfyBy(FincaDomain fincaDomain) {
        return isNotDefault(fincaDomain);
    }
    private boolean isNotDefault(FincaDomain fincaDomain){
        if (Objects.equals(fincaDomain.getNit().toString(), UtilUUID.DEFAULT_UUID_AS_STRING) && "" .equals(fincaDomain.getNombre())) {
            throw ServiceCropscanException.createUserException("No se encontro info de la finca dada");
        }else {
            return true;
        }
    }
}
