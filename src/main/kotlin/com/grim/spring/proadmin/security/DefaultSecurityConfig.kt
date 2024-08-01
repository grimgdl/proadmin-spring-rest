package com.grim.spring.proadmin.security

import com.grim.spring.proadmin.service.CustomUserDetailsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain


@EnableWebSecurity
@Configuration
class DefaultSecurityConfig(@Autowired private val customUserDetailsService: CustomUserDetailsService) {

//    @Bean
//    @ConditionalOnMissingBean(UserDetailsService::class)
//    fun inMemoryUserManager(): InMemoryUserDetailsManager {
//
//        val generatedPassword = passwordEncoder().encode("root")
//        return InMemoryUserDetailsManager(User.withUsername("user")
//            .password(generatedPassword)
//            .roles("USER")
//            .build())
//
//    }



    @Bean
    fun authenticationProvider(): DaoAuthenticationProvider {
        val authenticationProvider = DaoAuthenticationProvider()
        authenticationProvider.setUserDetailsService(customUserDetailsService)
        authenticationProvider.setPasswordEncoder(passwordEncoder())
        return authenticationProvider

    }




    @Bean
    fun securityFilterChain(http: HttpSecurity) : SecurityFilterChain {
        http.authorizeHttpRequests { auth ->
            auth.anyRequest().authenticated()
        }
            .httpBasic { httpBasic ->
                httpBasic.realmName("Grim")
            }
            .csrf { csrf ->
                csrf.disable()
            }


        return http.build()
    }


    @Bean
    fun passwordEncoder() : PasswordEncoder {
        return BCryptPasswordEncoder()
    }

}