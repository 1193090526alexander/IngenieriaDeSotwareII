package co.edu.org.cropscan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import co.edu.org.cropscan.entity.TipoDocumentoEntity;


@Repository
public interface TipoDocumentoRepository  extends JpaRepository<TipoDocumentoEntity, Integer>{

    
}
