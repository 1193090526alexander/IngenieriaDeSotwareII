package co.edu.org.cropscan.service.usecase.usuario;

import org.springframework.validation.annotation.Validated;

import co.edu.org.cropscan.service.domain.UsuarioDomain;
import co.edu.org.cropscan.service.usecase.UseCase;
@Validated
public interface RegistrarUsuarioUseCase extends UseCase<UsuarioDomain> {

}
