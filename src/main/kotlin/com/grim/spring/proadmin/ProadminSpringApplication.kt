package com.grim.spring.proadmin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProadminSpringApplication

fun main(args: Array<String>) {
	//println(BCryptPasswordEncoder().encode("gus19890719"))
	runApplication<ProadminSpringApplication>(*args)
}
