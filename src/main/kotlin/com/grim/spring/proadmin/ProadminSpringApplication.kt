package com.grim.spring.proadmin

import io.github.cdimascio.dotenv.Dotenv
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@SpringBootApplication
class ProadminSpringApplication

fun main(args: Array<String>) {

	val dotenv = Dotenv.load()
//	println("User ${dotenv["DB_NAME"]}")

	//println(BCryptPasswordEncoder().encode("gus19890719"))


	runApplication<ProadminSpringApplication>(*args)
}
