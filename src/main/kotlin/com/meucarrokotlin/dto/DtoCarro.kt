package com.meucarrokotlin.dto
import java.math.BigDecimal
import javax.validation.constraints.*


data class DtoCarro (
     val id:Long,
     val marca_id:Long,
     val marca_nome:String,

@NotNull(message = "Informe o modelo do veiculo")
 val modelo_id:Long,

val nome_modelo : String,

@Min(value = 1800, message = "Ano minimo não pode ser menor que 1800")
 val ano: Integer,

@NotBlank(message="Campo Obrigatório")
@Size(min = 3, max=255,message="campo com no mínimo 3 e no máximo de 255 caracteres.")
val combustivel : String,

     @Min(value = 2, message = "Numero minimo de porta são 2 ")
val num_portas:Integer,

 val valor_fipe:BigDecimal,

@NotBlank(message="Campo Obrigatório")
@Size(min = 3, max=255,message="campo com no mínimo 3 e no máximo de 255 caracteres.")
 val cor:String,

@NotNull(message = "Informe a data do cadastro")
val timestamp_cadastro : Long


)