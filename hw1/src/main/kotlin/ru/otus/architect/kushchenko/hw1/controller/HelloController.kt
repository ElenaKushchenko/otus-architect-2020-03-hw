package ru.otus.architect.kushchenko.hw1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("hello")
    fun getHello() = "Hello kitty!"
}