package com.meucarrokotlin.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size
@Entity
@Table(name = "MARCA")
data class Marca(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id : Long?,
        @NotBlank(message="Campo Obrigatório")
        @Size(min = 2, max=255,message="campo com no mínimo 2 e no máximo de 255 caracteres.")
        val nome_marca : String

)