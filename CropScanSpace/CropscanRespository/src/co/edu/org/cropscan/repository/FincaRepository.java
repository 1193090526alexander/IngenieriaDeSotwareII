package co.edu.org.cropscan.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.org.cropscan.entity.FincaEntity;

@Repository
public interface FincaRepository extends JpaRepository<FincaEntity, String>{

    @Modifying
    @Query(value="INSERT INTO public.ciudad(codigo, usuario                                                                                                                      , nombre) VALUES(?1,?2,?3)", nativeQuery = true)
    void createCityByDepartment(UUID FincaId, UUID UserID, String nombre);
}
