package com.grim.spring.proadmin

import io.github.cdimascio.dotenv.Dotenv
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProadminSpringApplication

fun main(args: Array<String>) {

	val dotenv = Dotenv.load()
	println("User ${dotenv["DB_NAME"]}")

	runApplication<ProadminSpringApplication>(*args)
}
