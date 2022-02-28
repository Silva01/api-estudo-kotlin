package br.net.silva.daniel.apideestudo.controller

import br.net.silva.daniel.apideestudo.model.Usuario
import br.net.silva.daniel.apideestudo.service.UsuarioServiceIMPL
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/usuario")
class UsuarioController(private val service: UsuarioServiceIMPL) {

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun criar(@RequestBody user : Usuario) = service criar user

    @GetMapping("/obter")
    fun obter() = service.obter()

    @PutMapping("/atualizar")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun atualizar(@RequestBody user : Usuario) = service atualizar user

    @DeleteMapping("/deletar/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    fun deletar(@PathVariable("id") id : Long) = service deletar id
}