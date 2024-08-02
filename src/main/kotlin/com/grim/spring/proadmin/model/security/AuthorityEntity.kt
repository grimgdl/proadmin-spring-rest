package com.grim.spring.proadmin.model.security

import jakarta.persistence.*

@Entity
@Table(name = "authorities")
data class AuthorityEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT UNSIGNED")
    val id: Int = 0,
    @Column(unique = true, nullable = false)
    val name: String
)