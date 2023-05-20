import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {
    public static void main(String[] args) throws Exception {
        /* Instanciação */
        /* (agora) --> Data-hora */

        // Data de agora (Data-hora local)
        LocalDate d01 = LocalDate.now();
        System.out.println("d01 = " + d01.toString());

        // Data e hora de agora(Data-hora local)
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("d01 = " + d02.toString());

        // Data-hora global(horario de Londres)
        Instant d03 = Instant.now();
        System.out.println("d03 = " + d03.toString());

        /* Texto ISO 8601 --> Data-hora */

        // Data
        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println("d04 = " + d04.toString());

        // Data e hora
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        System.out.println("d05 = " + d05.toString());

        // Data-hora global
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        System.out.println("d06 = " + d06.toString());

        // Data-hora do Brasil
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");System.out.println("d07 = " + d07.toString());

        /* Texto formato costumizado --> Data-hora */

        // Detalhe: para eu fazer o d08 utilizei esse site, o Date Time Formatter: // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        //
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        System.err.println("d08 = " + d08.toString());

        // Data e hora
        LocalDateTime d09 = LocalDateTime.parse("22/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("d09 = " + d09.toString());

        /* Dia,mês, ano, [horário] --> Data-hora local */

        // Data
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        System.out.println("d10 = " + d10.toString());

        // Data e horário
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
        System.out.println("d11 = " + d11.toString());



    }   
}
