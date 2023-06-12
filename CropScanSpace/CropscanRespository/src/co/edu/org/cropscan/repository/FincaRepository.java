package co.edu.org.cropscan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.org.cropscan.entity.FincaEntity;

@Repository
public interface FincaRepository extends JpaRepository<FincaEntity, String>{

}
