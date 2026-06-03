package com.hotelddj.hotel_ddj_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "habitaciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String numero;

    private String tipo;

    private Double precio;

    private Boolean disponible;
}