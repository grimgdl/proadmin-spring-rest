package com.grim.spring.proadmin.model

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "stores")
data class StoreEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    @Column(nullable = false, precision = 10, scale = 7)
    val lat: BigDecimal,
    @Column(nullable = false, precision = 10, scale = 7)
    val lon: BigDecimal,

    val phoneNumber: String,

    val address: String,
    @Column(columnDefinition = "bit default true", nullable = false)
    val status: Boolean = true,

    @ManyToOne
    @JoinColumn( name = "id_format", nullable = false)
    val format: FormatEntity

)
