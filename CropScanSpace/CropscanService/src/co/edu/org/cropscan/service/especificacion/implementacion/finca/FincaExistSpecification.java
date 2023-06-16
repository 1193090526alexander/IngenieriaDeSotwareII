package co.edu.org.cropscan.service.especificacion.implementacion.finca;

import co.edu.org.cropscan.crosscutting.exception.ServiceCropscanException;
import co.edu.org.cropscan.entity.FincaEntity;
import co.edu.org.cropscan.repository.FincaRepository;
import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.service.especificacion.CompositeSpecification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class FincaExistSpecification extends CompositeSpecification<FincaDomain> {

    private final FincaRepository cityRepository;

    public FincaExistSpecification(FincaRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public boolean isSatisfyBy(FincaDomain fincaDomain) {
        try {
            Optional<FincaEntity> response = cityRepository.findFincabyUser(FincaDomain.getUsuario().getId(),
                    fincaDomain.getNit());
            if (response.isPresent()) {
                throw ServiceCropscanException.createUserException("Error tratando de crear la finca, el nombre de la finca ya esta registrado");
            }
        } catch (ServiceCropscanException exception) {
            throw ServiceCropscanException.createUserException("Error al obtener la finca "+exception.getMessage());
        }
        return true;
    }
}

