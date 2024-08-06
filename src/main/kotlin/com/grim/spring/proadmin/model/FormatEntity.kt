package com.grim.spring.proadmin.model

import jakarta.persistence.*
import java.util.Date


@Entity
@Table(name = "formats")
data class FormatEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    @ManyToOne
    @JoinColumn( name = "id_group")
    val parentCompany: ParentCompanyEntity,
    @Column(columnDefinition = "bit default true", nullable = false)
    val status: Boolean,
    val img: String,
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP", nullable = false)
    val createdAt: Date

)
