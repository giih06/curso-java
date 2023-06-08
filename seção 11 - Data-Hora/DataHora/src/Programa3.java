import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Programa3 {
    public static void main(String[] args) throws Exception {
        /* Converter data-hora global oara local */

        // Data-hora global, timezone(sistema local) --> Data-hora local

        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Instante

        LocalDate res1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // COnverte o instante para uma data local considerando o fuso horáro do computador do usuário
        LocalDate res2 = LocalDate.ofInstant(d06, ZoneId.of
        ("Portugal"));
        LocalDateTime res3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime res4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("resultado 1 = " + res1);
        System.out.println("resultado 2 = " + res2);
        System.out.println("resultado 3 = " + res3);
        System.out.println("resultado 4 = " + res4);


        /* Obter dados de uma data-hora local */

        // Data-hora local --> dia, mês, ano, horário
        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 Ano = " + d04.getYear());

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());




    }
}
