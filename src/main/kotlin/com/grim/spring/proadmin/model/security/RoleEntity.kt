package com.grim.spring.proadmin.model.security

import jakarta.persistence.*
import java.util.HashSet

@Entity
@Table(name="roles")
data class RoleEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT UNSIGNED ")
    val idRole: Int = 0,
    @Column(unique = true, nullable = false)
    val name: String,

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "role_authorities",
        joinColumns = [ JoinColumn(name = "role_id") ],
        inverseJoinColumns = [JoinColumn(name = "authority_id")]
    )
    val authorities: Set<AuthorityEntity> = HashSet()
)
