package com.grim.spring.proadmin.controller

import com.grim.spring.proadmin.model.UserEntity
import com.grim.spring.proadmin.service.UserService
import com.grim.spring.proadmin.util.MyJson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(@Autowired private val userService: UserService) {


    @GetMapping("/all")
    fun getUsers(): MyJson<UserEntity> {
        return MyJson(userService.getUsers())
    }

    @PostMapping
    fun createUser(@RequestBody user: UserEntity) : UserEntity{
        return userService.createUser(user)
    }


}