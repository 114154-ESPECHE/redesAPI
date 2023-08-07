package com.example.redesapi.Controllers;

import com.example.redesapi.DTOs.UbicacionResponseDTO;
import com.example.redesapi.Entities.UbicacionEntity;
import com.example.redesapi.Services.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ubicaciones")
public class UbicacionController {

    @Autowired
    UbicacionService ubicacionService;

    @GetMapping("/ubicacion/{direccion}")
    public ResponseEntity<UbicacionEntity> getUbicacionEntity(@RequestParam String direccion){
        UbicacionEntity ubicacionEntity = ubicacionService.getUbicacionByDireccion(direccion);
        if (ubicacionEntity == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(ubicacionEntity);
    }

    @GetMapping("/dto/{direccion}")
    public ResponseEntity<UbicacionResponseDTO> getEntityDTO(@RequestParam String direccion){
        UbicacionResponseDTO ubicacionResponseDTO = ubicacionService.getUbicacionDTO(direccion);
        if (ubicacionResponseDTO == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(ubicacionResponseDTO);
    }
}
