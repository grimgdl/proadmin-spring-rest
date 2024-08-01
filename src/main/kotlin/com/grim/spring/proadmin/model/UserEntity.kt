package com.grim.spring.proadmin.model

import jakarta.persistence.*


@Entity
@Table(name = "users2")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    val lastName: String,
    val username: String? = null,
    var password: String,
    val enabled: Boolean = true
)