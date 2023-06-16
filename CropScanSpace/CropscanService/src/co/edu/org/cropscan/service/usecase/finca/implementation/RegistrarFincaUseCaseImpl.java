package co.edu.org.cropscan.service.usecase.finca.implementation;

import co.edu.org.cropscan.crosscutting.exception.CropscanCropscanException;
import co.edu.org.cropscan.crosscutting.exception.utilidades.UtilUUID;
import co.edu.org.cropscan.crosscutting.exception.ServiceCropscanException;
import co.edu.org.cropscan.entity.FincaEntity;
import co.edu.org.cropscan.repository.FincaRepository;
import co.edu.org.cropscan.service.domain.FincaDomain;
import co.edu.org.cropscan.service.mapper.entityassembler.EntityAssembler;
import co.edu.org.cropscan.service.especificacion.implementacion.finca.ValidFincaSpecification;
import co.edu.org.cropscan.service.usecase.finca.RegistrarFincaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrarFincaUseCaseImpl implements RegistrarFincaUseCase {

    private final FincaRepository cityRepository;
    private final ModelMapper<FincaEntity, FincaDomain> ModelMapper;
    private final ValidFincaSpecification validFincaSpecification;

    public RegistrarFincaUseCaseImpl(FincaRepository fincaRepository, ModelMapper<FincaEntity, FincaDomain> ModelMapper, ValidFIncaSpecification validFincaSpecification) {
        this.FincaRepository = fincaRepository;
        this.ModelMapper= modelMapper;
        this.validFincaSpecification = validFincaSpecification;
    }

    @Override
    public void execute(FincaDomain domain) {
        try {
            domain.setNit(UtilUUID.getNewUUID());
            FincaEntity entity = entityAssembler.assembleEntity(domain);
            validFincaSpecification.isSatisfyBy(domain);
            FincaRepository.createCityByDepartment(entity.getNit(),entity.().getId()
                        ,entity.getName());
        } catch (ServiceCropscanException exception) {
            throw exception;
        } catch (Exception e) {
            throw ServiceCropscanException.createTechnicalException("Hubo un error tratando de crear la finca ",e);
        }
    }
}
