package com.grim.spring.proadmin.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.servlet.NoHandlerFoundException


@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(NoHandlerFoundException::class)
    fun notFound(e: NoHandlerFoundException): ResponseEntity<CustomResponse> {
        return ResponseEntity<CustomResponse>(CustomResponse(e.message?: "errorrrr", 404), HttpStatus.NOT_FOUND)
    }

}


data class CustomResponse(val message: String, val status: Int)