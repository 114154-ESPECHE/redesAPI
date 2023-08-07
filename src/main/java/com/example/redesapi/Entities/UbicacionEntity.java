package com.example.redesapi.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
    @ManyToMany
    @JoinTable(name = "ubicaciones_redes",
            joinColumns = @JoinColumn(name = "idUbicacion"),
            inverseJoinColumns = @JoinColumn(name = "idRed"))
    private List<RedEntity> Red;
}
