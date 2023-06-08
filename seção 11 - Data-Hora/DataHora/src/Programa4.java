import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Programa4 {
    public static void main(String[] args) throws Exception {
        /* Cálculos com data-hora */

        // Data-hora +/- tempo --> Data-hora

        // Data
        LocalDate d04 = LocalDate.parse("2022-07-20");
        // Diminuindo 7 dias
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        // Aumentando 7 dias
        LocalDate nextweekLocalDate = d04.plusDays(7);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextweekLocalDate);

        // Data e hora
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        // Diminuindo 7 dias
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        // Aumentando 7 dias
        LocalDateTime nextweekLocalDateTime = d05.plusDays(7);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextweekLocalDateTime);
        
        // Data-hora global
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        // Diminuindo 7 dias
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        // Aumentando 7 dias
        Instant nextweekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextweekInstant);

        // Data-hora1, Data-hora2 --> Duração

        // Calculadndo durações entre duas data-horas

        // Data
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0));// .atTime(0, 0) significa a mesma coisa que .atStartOfDay()
        System.out.println("t1 dias = " + t1.toDays());
        
        // Data e hora
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t2 dias = " + t2.toDays());

        // Data-hora global
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());



    }
}
