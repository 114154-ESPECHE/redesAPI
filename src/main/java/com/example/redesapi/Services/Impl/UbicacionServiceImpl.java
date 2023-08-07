package com.example.redesapi.Services.Impl;

import com.example.redesapi.Entities.UbicacionEntity;
import com.example.redesapi.Repositories.jpa.UbicacionJPARepository;
import com.example.redesapi.Services.UbicacionService;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicacionServiceImpl  implements UbicacionService {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    UbicacionJPARepository ubicacionJPARepository;
    @Override
    public List<UbicacionEntity> getUbicacionByDireccion(String direccion) {
        List<UbicacionEntity> entity = ubicacionJPARepository.findUbicacionEntitiesByDireccion(direccion);
        if (entity == null){
            throw new EntityNotFoundException("Entidad no encontrada");
        }
        return entity;
    }
}
