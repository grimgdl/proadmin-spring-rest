package com.grim.spring.proadmin.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.sql.Timestamp
import java.util.Date


@Entity
data class Brand(
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
