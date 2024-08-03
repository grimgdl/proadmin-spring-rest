package com.grim.spring.proadmin.model

import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.*
import java.util.Date


@Entity
@Table(name = "products")
data class ProductEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    val createdAt: Date = Date(),

    @ManyToOne
    @JoinColumn( name = "id_brand", nullable = false)
    @JsonBackReference
    val brand: BrandEntity
)
