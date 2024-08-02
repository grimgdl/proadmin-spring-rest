package com.grim.spring.proadmin.controller

import com.grim.spring.proadmin.model.UserDTO
import com.grim.spring.proadmin.model.UserEntity
import com.grim.spring.proadmin.respository.RoleRepository
import com.grim.spring.proadmin.service.UserService
import com.grim.spring.proadmin.util.MyJson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.management.relation.RoleNotFoundException

@RestController
@RequestMapping("/user")
class UserController(
    @Autowired private val userService: UserService,
    @Autowired private val roleRepository: RoleRepository
) {


    @GetMapping("/all")
    fun getUsers(): MyJson<UserEntity> {
        return MyJson(userService.getUsers())
    }

    @PostMapping
    fun createUser(@RequestBody user: UserDTO) : UserEntity{

        val role = roleRepository.findById(user.roleId)
            .orElseThrow {
                RoleNotFoundException("Role not found ")
            }
        val userEntity = UserEntity(
            name = user.name,
            lastName = user.lastName,
            username = user.username,
            password = user.password,
            role = role

        )
        return userService.createUser(userEntity)
    }


}