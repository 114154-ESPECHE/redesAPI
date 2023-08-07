package com.example.redesapi.DTOs;

import com.example.redesapi.Entities.EmpresaEntity;
import com.example.redesapi.Entities.RedEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UbicacionResponseDTO {
    private String direccion;
    private Long telefono;
    private String nombre;
    private RedResponseDTO red;
}
