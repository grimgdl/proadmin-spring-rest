package com.grim.spring.proadmin.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import java.sql.Timestamp
import java.util.Date


@Entity
@Table(name = "brands")
data class BrandEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMarca")
    val idMarca: Int = 0,
    val nombre: String = "",
    @JsonIgnore
    @Column(name = "fechaCreacion", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    val fechaCreacion: Timestamp? = null,
    val tipo: Int = 0,
    @Column(name = "logo_img", columnDefinition = "INT DEFAULT 0")
    val img: Int = 0,
    @Column(name = "estatus", columnDefinition = "INT DEFAULT 1")
    val estatus: Int = 1,
    @Column(name = "fecha_baja", columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    val dateDown: Date

)
