package com.grim.spring.proadmin.controller;


import com.grim.spring.proadmin.model.StoreEntity
import com.grim.spring.proadmin.service.StoreService;
import com.grim.spring.proadmin.util.MyJson
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController;

@RestController
class StoreController(@Autowired private val storeService: StoreService) {

    @GetMapping("/stores")
    fun getAllStores(): MyJson<StoreEntity> {
        val stores = storeService.getStores()

        return MyJson(stores)
    }

}
