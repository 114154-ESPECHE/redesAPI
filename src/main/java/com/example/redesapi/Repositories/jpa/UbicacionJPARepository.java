package com.example.redesapi.Repositories.jpa;

import com.example.redesapi.Entities.UbicacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UbicacionJPARepository extends JpaRepository<UbicacionEntity, Long> {
    List<UbicacionEntity> findUbicacionEntitiesByDireccion(String direccion);
}
