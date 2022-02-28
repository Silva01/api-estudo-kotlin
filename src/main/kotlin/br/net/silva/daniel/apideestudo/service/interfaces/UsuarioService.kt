package br.net.silva.daniel.apideestudo.service.interfaces

import br.net.silva.daniel.apideestudo.model.Usuario

interface UsuarioService {
    infix fun criar(user : Usuario) : Usuario
    fun obter() : MutableIterable<Usuario>
    infix fun atualizar(user : Usuario) : Usuario
    infix fun deletar(id : Long)
}