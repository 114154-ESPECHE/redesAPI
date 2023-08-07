package com.example.redesapi.Services.Impl;

import com.example.redesapi.DTOs.EmpresaResponseDTO;
import com.example.redesapi.DTOs.RedResponseDTO;
import com.example.redesapi.DTOs.UbicacionResponseDTO;
import com.example.redesapi.Entities.RedEntity;
import com.example.redesapi.Entities.EmpresaEntity;
import com.example.redesapi.Entities.UbicacionEntity;
import com.example.redesapi.Repositories.jpa.UbicacionJPARepository;
import com.example.redesapi.Services.UbicacionService;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UbicacionServiceImpl  implements UbicacionService {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    UbicacionJPARepository ubicacionJPARepository;
    @Override
    public UbicacionEntity getUbicacionByDireccion(String direccion) {
        UbicacionEntity ubicacionEntity = ubicacionJPARepository.findUbicacionEntitiesByDireccion(direccion);
        if (ubicacionEntity == null){
            throw new EntityNotFoundException("Entidad no encontrada");
        }
        return ubicacionEntity;

    }

    @Override
    public UbicacionResponseDTO getUbicacionDTO(String direccion) {
        UbicacionEntity ubicacionEntity = ubicacionJPARepository.findUbicacionEntitiesByDireccion(direccion);
        if (ubicacionEntity == null) {
            throw new EntityNotFoundException("Dirección no encontrada por ubicación");
        }

        return null;
    }


}
