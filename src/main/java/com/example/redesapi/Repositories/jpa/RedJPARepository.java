package com.example.redesapi.Repositories.jpa;

import com.example.redesapi.Entities.RedEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RedJPARepository extends JpaRepository <RedEntity, Long> {
}
