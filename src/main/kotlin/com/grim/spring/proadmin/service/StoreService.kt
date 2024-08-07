package com.grim.spring.proadmin.service

import com.grim.spring.proadmin.model.StoreEntity
import com.grim.spring.proadmin.respository.StoreRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class StoreService(@Autowired private val storeRepository: StoreRepository) {

    fun getStores(): List<StoreEntity> {
        return storeRepository.findAll()
    }

    fun getStoresByName( name: String): List<StoreEntity> {
        return storeRepository.findByNameContainingOrFormatNameContainingAndStatusIsTrue(name.trim(), name.trim())
    }


}