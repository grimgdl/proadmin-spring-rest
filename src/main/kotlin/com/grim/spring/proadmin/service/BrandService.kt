package com.grim.spring.proadmin.service

import com.grim.spring.proadmin.model.BrandEntity
import com.grim.spring.proadmin.respository.BrandRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class BrandService(@Autowired private val brandRepository: BrandRepository) {

    fun getAllBrands(): List<BrandEntity> {
        return brandRepository.findAll()
    }




}