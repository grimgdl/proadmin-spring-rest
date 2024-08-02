package com.grim.spring.proadmin.respository

import com.grim.spring.proadmin.model.BrandEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BrandRepository: JpaRepository<BrandEntity, Int>
