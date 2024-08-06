package com.grim.spring.proadmin.model

import jakarta.persistence.*
import java.util.*


@Entity
@Table(name = "company_groups")
data class ParentCompanyEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    @Column(nullable = false, columnDefinition = "bit default true")
    val status: Boolean ,
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    val createdAt: Date,
    val img: String? = null

)
