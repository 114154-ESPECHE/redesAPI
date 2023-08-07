package com.example.redesapi.Services;

import com.example.redesapi.Entities.UbicacionEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UbicacionService {

    List<UbicacionEntity> getUbicacionByDireccion(String direccion);
}
