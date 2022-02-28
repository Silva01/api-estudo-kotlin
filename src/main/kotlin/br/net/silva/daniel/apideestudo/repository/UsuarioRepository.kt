package br.net.silva.daniel.apideestudo.repository

import br.net.silva.daniel.apideestudo.model.Usuario
import org.springframework.data.repository.CrudRepository

interface UsuarioRepository : CrudRepository<Usuario, Long> {
}