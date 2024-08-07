package com.grim.spring.proadmin.respository

import com.grim.spring.proadmin.model.StoreEntity
import org.springframework.data.jpa.repository.JpaRepository

interface StoreRepository: JpaRepository<StoreEntity, Int> {

    fun findByNameContainingOrFormatNameContainingAndStatusIsTrue(name: String, formatName: String) : List<StoreEntity>



}