package com.example.redesapi.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "REDES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRed;
    @ManyToOne
    @JoinColumn(name = "idEmpresa")
    private EmpresaEntity idEmpresa;
}
