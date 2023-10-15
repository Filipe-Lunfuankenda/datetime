import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val dataHoraAtual = LocalDateTime.now()
    val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
    val dataHoraFormatada = dataHoraAtual.format(formato)
    println("Current Date and Time: $dataHoraFormatada")
}
