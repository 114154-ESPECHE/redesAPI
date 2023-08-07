package com.example.redesapi.Repositories.jpa;

import com.example.redesapi.Entities.UbicacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UbicacionJPARepository extends JpaRepository<UbicacionEntity, Long> {
    UbicacionEntity findUbicacionEntitiesByDireccion(String direccion);
}
