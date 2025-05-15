package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.UUID

@Entity
@Table(name = "Funcionarios")
data class Funcionario(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nome : String,
    val salario: Float,
    val cargo : String,
    @JsonFormat(pattern= "yy-MM-dd  HH:mm:ss")
    val dataContratacao : LocalDateTime = LocalDateTime.now(),
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    val funcional: String = UUID.randomUUID().toString()


)
