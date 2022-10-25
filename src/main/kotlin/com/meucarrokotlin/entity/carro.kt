import com.meucarrokotlin.entity.Modelo
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "CARRO")
data class Carro(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : Long?,
        val timestamp_cadastro : LocalDate,
        val modelo_id : Modelo,
        val ano: Integer,
        val combustivel: String,
        val num_portas: Integer,
        val cor: String
)