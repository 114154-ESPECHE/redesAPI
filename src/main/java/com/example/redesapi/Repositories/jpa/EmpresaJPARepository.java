package com.example.redesapi.Repositories.jpa;

import com.example.redesapi.Entities.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaJPARepository extends JpaRepository<EmpresaEntity, Long> {
}
