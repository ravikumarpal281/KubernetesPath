package com.certification.certifications.repository

import com.certification.certifications.entity.CertifcateEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CertificateRepo : JpaRepository<CertifcateEntity, Long> {
     fun findByUserId(userId : Long) : List<CertifcateEntity>
}