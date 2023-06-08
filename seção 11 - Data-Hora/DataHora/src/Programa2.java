import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Programa2 {
    /* Date time Fortmatter: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html */
    public static void main(String[] args) throws Exception { 
        /* Formatação */
        /* Data-hora --> Texto ISO 8601 */

        // Data
        LocalDate d04 = LocalDate.parse("2022-07-20");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // A seguir, combinações que funciona o código
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Data e horário
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2)); //formato com horário

        // Data-hora Global
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // o .withzone(ZoneId.system default()) pega o fuso-horário do coputador do usuário
        System.out.println("d06 = " + fmt3.format(d06)); // QUando for instant, tem que formatar especificando o fuso horário.

        // Data e horário - oracle
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // do site- esse comando não podem ser inseridas datas locais sem fuso hprário se não dará erro!
        System.out.println("d05 = " + d05.format(fmt4));

        // Data-hora Global - oracle
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("d06 = " + fmt5.format(d06));


 



    }
}
