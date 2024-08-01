package com.grim.spring.proadmin.service

import com.grim.spring.proadmin.model.UserEntity
import com.grim.spring.proadmin.respository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(@Autowired private val userRepository: UserRepository) {

    fun getUsers() : List<UserEntity>{
        return userRepository.findAll()
    }





    fun createUser(user: UserEntity): UserEntity {
        user.password = BCryptPasswordEncoder().encode(user.password)
        return userRepository.save(user)
    }


}