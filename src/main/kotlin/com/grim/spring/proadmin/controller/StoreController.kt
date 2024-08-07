package com.grim.spring.proadmin.controller;


import com.grim.spring.proadmin.model.StoreEntity
import com.grim.spring.proadmin.service.StoreService;
import com.grim.spring.proadmin.util.MyJson
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController;

@RestController
class StoreController(@Autowired private val storeService: StoreService) {

    @GetMapping("/stores")
    fun getAllStores(@RequestParam name: String? ): MyJson<StoreEntity> {

        val stores = name?.let {
            storeService.getStoresByName(name)
        } ?: storeService.getStores()

        return MyJson(stores)
    }


}
