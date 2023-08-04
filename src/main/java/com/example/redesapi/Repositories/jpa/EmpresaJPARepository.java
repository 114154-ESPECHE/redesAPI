package com.example.redesapi.Repositories.jpa;

import com.example.redesapi.Entities.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaJPARepository extends JpaRepository<EmpresaEntity, Long> {
}
