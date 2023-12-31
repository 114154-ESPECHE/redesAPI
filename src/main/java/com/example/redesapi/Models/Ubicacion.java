package com.example.redesapi.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ubicacion {
    private Long idUbicacion;
    private String direccion;
    private Long telefono;
    private Red red;
}
