package com.example.redesapi.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {
    private Long idEmpresa;
    private String nombre;
    private String url;
}
