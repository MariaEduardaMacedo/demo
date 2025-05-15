package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

@Entity
@Table(name = "Funcionarios")
data class Funcionario(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val funcional: String? = "",
    val nome : String? = "",
    val salario: Double? = 0.0,
    val cargo : String? = ""

)
