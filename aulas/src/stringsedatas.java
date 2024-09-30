import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class stringsedatas {
    public static void main(String[] args) {
        String nome = "Marcos";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String nomeOutro = "marcos";
        System.out.println(nome.equals(nomeOutro));
        System.out.println(nome.equalsIgnoreCase(nomeOutro));

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 6 && agora.getHour() < 12) {
            saudacao = "Bom dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 6) {
            saudacao = "Boa noite!";
        } else {
            saudacao = "Boa semana!";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaDaSemana, saudacao.toUpperCase());
    }
}
