package com.certification.certifications.service

import com.certification.certifications.entity.CertifcateEntity
import com.certification.certifications.repository.CertificateRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CertificateService(@Autowired val certificateRepo : CertificateRepo) {

    fun certificateDetails(id : Long) : Optional<CertifcateEntity> = certificateRepo.findById(id);
    fun addCertificate(certificate : CertifcateEntity) : CertifcateEntity = certificateRepo.save(certificate);
    fun certificateForUser(userId : Long) : List<CertifcateEntity> = certificateRepo.findByUserId(userId)

}