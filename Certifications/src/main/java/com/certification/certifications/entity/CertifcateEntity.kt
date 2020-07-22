package com.certification.certifications.entity

import javax.annotation.Generated
import javax.persistence.*

@Entity
@Table(name = "certificates")
class CertifcateEntity (

        @Id
        @GeneratedValue
        val id : Long = 0,

        @Column(nullable = false)
        val userId : Long = 0,

        @Column(nullable = false, length = 100)
        val certificateName : String = "",

        @Column(nullable = false, length = 400)
        val certificateDesc : String = "",

        @Column(nullable = false,length = 200)
        val organization : String = "",

        @Column(nullable = false, length = 200)
        val validity : String = ""
){
}