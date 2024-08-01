package com.grim.spring.proadmin.respository

import com.grim.spring.proadmin.model.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository: JpaRepository<UserEntity, Int> {
    fun findByUsername(username: String): Optional<UserEntity>
}