package com.grim.spring.proadmin.controller

import com.grim.spring.proadmin.model.BrandEntity
import com.grim.spring.proadmin.service.BrandService
import com.grim.spring.proadmin.util.MyJson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class BrandController(@Autowired private val brandService: BrandService ) {


    @GetMapping("/brands")
    fun getBrands(): MyJson<BrandEntity> {
        val brands = brandService.getAllBrands()
        return MyJson(brands)
    }





}