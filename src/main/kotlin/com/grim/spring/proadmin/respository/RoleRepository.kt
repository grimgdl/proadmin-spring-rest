package com.grim.spring.proadmin.respository

import com.grim.spring.proadmin.model.security.RoleEntity
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<RoleEntity, Int> {
}