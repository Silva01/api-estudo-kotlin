package br.net.silva.daniel.apideestudo.service

import br.net.silva.daniel.apideestudo.model.Usuario
import br.net.silva.daniel.apideestudo.repository.UsuarioRepository
import br.net.silva.daniel.apideestudo.service.interfaces.UsuarioService
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsuarioServiceIMPL(private val repository: UsuarioRepository) : UsuarioService {

    override fun criar(user: Usuario): Usuario {
        return repository.save(user)
    }

    override fun obter(): MutableIterable<Usuario> {
        return repository.findAll()
    }

    override fun atualizar(user: Usuario): Usuario {
        return this.criar(user)
    }

    override fun deletar(id: Long) {
        val user : Optional<Usuario> = repository.findById(id)
        if (user.isPresent) repository.delete(user.get())
    }
}