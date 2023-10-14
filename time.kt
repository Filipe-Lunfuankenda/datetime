import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val dataHoraAtual = LocalDateTime.now()
    val format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
    val dataHoraFormatada = dataHoraAtual.format(format)
    println("Current Date and Time: $dataHoraFormatada")
}
