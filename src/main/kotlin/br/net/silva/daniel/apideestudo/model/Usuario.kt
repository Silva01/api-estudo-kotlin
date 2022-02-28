package br.net.silva.daniel.apideestudo.model

import javax.persistence.*

@Entity
class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long = 0

    @Column(name = "nome")
    val nome : String = ""

    @Column(name = "cpf")
    val cpf : String = ""

    @Column(name = "idade")
    val idade : Int = 0
}