package com.profilebuilder.profilebuilder.service

import com.profilebuilder.profilebuilder.entity.UserProfile
import com.profilebuilder.profilebuilder.repository.UserProfileRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(@Autowired private val userRepo : UserProfileRepo) {

    fun userDetails(id : Long) : Optional<UserProfile> = userRepo.findById(id)
    fun addUserDetails(userModel: UserProfile): UserProfile = userRepo.save(userModel)

}