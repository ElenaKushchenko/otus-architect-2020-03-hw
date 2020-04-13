package ru.otus.architect.kushchenko.hw1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("health")
    fun getOk() = mapOf("status" to "OK")
}