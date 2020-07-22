package com.profilebuilder.profilebuilder.repository

import com.profilebuilder.profilebuilder.entity.UserProfile
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserProfileRepo : JpaRepository<UserProfile, Long> {

}