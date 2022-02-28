package br.net.silva.daniel.apideestudo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hello")
class HelloController {

    @GetMapping("/mensagem")
    fun hello() = "Iniciando uma API com Kotlin"
}