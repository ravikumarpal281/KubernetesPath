package com.profilebuilder.profilebuilder.controllers

import com.profilebuilder.profilebuilder.entity.UserProfile
import com.profilebuilder.profilebuilder.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/welcome")
class WelcomeController(@Autowired val userService : UserService) {

    @GetMapping("/hello")
    fun helloProfile() : String = "Hello World"

    @GetMapping("/userProfile/{id}")
    fun userProfile(@PathVariable id : Long) : ResponseEntity<UserProfile> {
        val profile : Optional<UserProfile> = userService.userDetails(id)
        profile.isPresent
        return if(profile.isPresent)
            ResponseEntity.ok(profile.get())
        else
            ResponseEntity.notFound().build()

    }

    @PostMapping("/userProfile")
    fun addUserProfile(@RequestBody userModel : UserProfile) : UserProfile = userService.addUserDetails(userModel)

}