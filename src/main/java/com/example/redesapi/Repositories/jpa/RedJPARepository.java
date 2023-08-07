package com.example.redesapi.Repositories.jpa;

import com.example.redesapi.Entities.RedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedJPARepository extends JpaRepository <RedEntity, Long> {
}
