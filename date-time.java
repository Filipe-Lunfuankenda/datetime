import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Date currentDateTime = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = format.format(currentDateTime);

        System.out.println("Data e Hora Atuais: " + dataHoraFormatada);
    }
}