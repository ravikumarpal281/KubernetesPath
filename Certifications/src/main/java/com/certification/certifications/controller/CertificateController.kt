package com.certification.certifications.controller

import com.certification.certifications.entity.CertifcateEntity
import com.certification.certifications.service.CertificateService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cert")
class CertificateController(@Autowired val service : CertificateService) {

    @GetMapping("/helloCert")
    fun helloCertificate() : String = "Certifcate Service"

    @GetMapping("/{id}")
    fun findCertificate(@PathVariable id : Long)  : ResponseEntity<CertifcateEntity> {
        val cert = service.certificateDetails(id)
        return if(cert.isPresent)
            ResponseEntity.ok().body(cert.get())
        else ResponseEntity.notFound().build()
    }

    @GetMapping("/certOfUser/{userId}")
    fun getCertOfUser(@PathVariable userId : Long) : List<CertifcateEntity> = service.certificateForUser(userId)

    @PostMapping
    fun addCertificate(@RequestBody certificate : CertifcateEntity) : CertifcateEntity = service.addCertificate(certificate)

}