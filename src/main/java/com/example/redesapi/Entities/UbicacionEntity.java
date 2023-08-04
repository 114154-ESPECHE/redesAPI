package com.example.redesapi.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "UBICACIONES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UbicacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUbicacion;
    @Column
    private String direccion;
    @Column
    private Long telefono;
    @ManyToOne
    @JoinColumn(name = "idRed")
    private RedEntity idRed;
}
