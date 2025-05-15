package com.example.demo.controller
import com.example.demo.model.Funcionario
import com.example.demo.repository.FuncionarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody

@RestController
class FuncionarioController {
    @Autowired
    private lateinit var funcionarioRepository : FuncionarioRepository

    @GetMapping("/Listar")
    fun listarFuncionarios(): List<Funcionario> = funcionarioRepository.findAll()

    @PostMapping("cadastrar")
    fun cadastrar(@RequestBody funcionario: Funcionario) : Funcionario {
        return funcionarioRepository.save(funcionario)
    }

}