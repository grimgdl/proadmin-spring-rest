package com.grim.spring.proadmin.model

import com.fasterxml.jackson.annotation.JsonIgnore
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
    @JsonIgnore
    val username: String,
    @Column(nullable = false)
    @JsonIgnore
    var password: String,
    @Column(nullable = false, columnDefinition = "bit default true")
    val status: Boolean = true,

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    val role: RoleEntity
)