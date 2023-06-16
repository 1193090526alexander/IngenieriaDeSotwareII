package co.edu.org.cropscan.service.especificacion.implementacion.finca;

import co.edu.org.cropscan.crosscutting.exception.ServiceCropscanException;
import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.service.especificacion.CompositeSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidFincaSpecification extends CompositeSpecification<FincaDomain> {

    @Autowired
    FincaExistSpecification fincayExist;

    @Autowired
    FincaValidSpecification fincaIdValid;

    @Autowired
    FincaIsNotDefaultSpecification fincaIsNotDefault;

    @Autowired
    FincaNameValidSpecification fincaNameValid;

    @Override
    public boolean isSatisfyBy(FincaDomain fincaDomain) {
        try {
            return fincaIsNotDefault.and(fincaIdValid)
                    .and(fincaExist).and(fincaNameValid).isSatisfyBy(fincaDomain);
        }catch (ServiceCropscanException e){
            throw e;
        }
    }
}
