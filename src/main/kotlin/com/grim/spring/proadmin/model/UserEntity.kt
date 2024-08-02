package com.grim.spring.proadmin.model

import com.grim.spring.proadmin.model.security.RoleEntity
import jakarta.persistence.*


@Entity
@Table(name = "users")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT UNSIGNED")
    val id: Long = 0,
    val name: String,
    val lastName: String,
    @Column(unique = true, nullable = false)
    val username: String,
    @Column(nullable = false)
    var password: String,
    val enabled: Boolean = true,

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    val role: RoleEntity
)