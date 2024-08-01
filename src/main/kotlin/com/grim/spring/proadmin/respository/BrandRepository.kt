package com.grim.spring.proadmin.respository

import com.grim.spring.proadmin.model.Brand
import org.springframework.data.jpa.repository.JpaRepository

interface BrandRepository: JpaRepository<Brand, Int>
