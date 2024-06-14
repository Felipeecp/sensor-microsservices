package io.github.felipeecp.cadastrosensores.domain.model

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.PastOrPresent
import jakarta.validation.constraints.Size
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document(collection = "sensors")
data class Sensor(
    @Id var id: String? = null,
    @field:NotBlank(message = "Nome é obrigatorio")
    val name: String,
    @field:NotBlank(message = "Tipo é obrigatorio")
    val type: String,
    @field:NotBlank(message = "Localização é obrigatoria")
    val location: String,
    val description: String? = null,
    @field:PastOrPresent(message = "Data de instalação invalida, a data deve anterior ou igual a data atual")
    val installationDate: LocalDate = LocalDate.now(),
    @field:PastOrPresent(message = "Data de instalação invalida, a data deve anterior ou igual a data atual")
    val lastMaintaneDate: LocalDate? = null,
    @field:Size(max=50,message = "O numero do modelo não deve ter mais que 50 caracteres")
    val modelName: String? = null,
    @field:NotBlank(message = "Necessàrio informar status")
    val status: Status = Status.ATIVO,
)
