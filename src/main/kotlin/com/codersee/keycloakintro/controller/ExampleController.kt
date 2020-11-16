package com.codersee.keycloakintro.controller

import org.springframework.http.ResponseEntity
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ExampleController {

    @GetMapping("/example")
    @PreAuthorize("hasRole('USER')")
    fun getUserInfo(): ResponseEntity<String> =
        ResponseEntity.ok("User info")

    @GetMapping("/example/admin")
    @PreAuthorize("hasRole('ADMIN')")
    fun getAdminInfo(): ResponseEntity<String> =
        ResponseEntity.ok("User info")

    @GetMapping("/public/example")
    fun getPublicInfo(): ResponseEntity<String> =
        ResponseEntity.ok("Public info")
}