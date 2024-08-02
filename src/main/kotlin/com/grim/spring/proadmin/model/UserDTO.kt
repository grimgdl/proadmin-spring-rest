package com.grim.spring.proadmin.model

data class UserDTO(
    val name: String,
    val lastName: String,
    val username: String,
    val password: String,
    val enabled: Boolean = true,
    val roleId: Int
)
