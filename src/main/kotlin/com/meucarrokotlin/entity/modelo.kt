package com.meucarrokotlin.entity


import java.math.BigDecimal
import com.meucarrokotlin.entity.Marca
import javax.persistence.*
import javax.validation.constraints.*


@Entity
@Table(name = "MODELO")
data class Modelo(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id:Long?,

        @ManyToOne
        @JoinColumn(name = "marca_id")
        val marca_id : Marca,

        @NotBlank(message="Campo Obrigatório")
        @Size(min = 2, max=255,message="campo com no mínimo 2 e no máximo de 255 caracteres.")
        val nome : String,

        @NotNull(message = "Campo Obrigatório")
        @DecimalMin(value = "0.99", inclusive = false, message = "Valor minimo 0.99")
        @DecimalMax(value = "999999.99", inclusive = true, message = "Valor maximo 999.999.99")
        @Digits(integer = 6, fraction = 2)
        val valor_fipe : BigDecimal

)