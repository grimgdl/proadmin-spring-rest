package com.grim.spring.proadmin.service

import com.grim.spring.proadmin.respository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service


@Service
class CustomUserDetailsService(@Autowired private val userRepository: UserRepository) : UserDetailsService {


    override fun loadUserByUsername(username: String): UserDetails {
        val user = userRepository.findByUsername(username)
            .orElseThrow {
                UsernameNotFoundException("User not found ")
            }

        //list of authorities by role
        val authorities = user.role.authorities.map { authority ->
            SimpleGrantedAuthority(authority.name)
        }
        //println(authorities)

        return org.springframework.security.core.userdetails.User.builder()
            .username(user.username)
            .password(user.password)
            .authorities(authorities)
            .disabled(!user.enabled)
            .build()
    }
}