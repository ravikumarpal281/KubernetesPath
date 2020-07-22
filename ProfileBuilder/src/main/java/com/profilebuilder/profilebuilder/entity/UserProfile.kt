package com.profilebuilder.profilebuilder.entity

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "userprofile")
data class UserProfile (
        @Id
        @GeneratedValue
        val id : Long = 0,

        @Column(nullable = false, length = 50)
        val userName : String = "",

        @Column(nullable = false, length = 50)
        val title : String = "",

        @Column(nullable = false, length = 50)
        val currentOrg : String = "",

        @Column(nullable = false)
        val summary : String = "",

        @Column(nullable = false)
        val bio : String = ""

){
}