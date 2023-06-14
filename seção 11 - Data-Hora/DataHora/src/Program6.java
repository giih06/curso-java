import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

public class Program6 {
    // Manipulando uma data com Calendar ( versão antiga do java)
    public static void main(String[] args) throws Exception {
        /* Somando uma unidade de tempo */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        System.out.println(sdf.format(d));

        /* Obtendo uma unidade de tempo */
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d2 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf2.format(d));

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(d2);
        int minutes2 = cal2.get(Calendar.MINUTE);
        int month2 = 1 + cal2.get(Calendar.MONTH);

        System.out.println("Minutes: " + minutes2);
        System.out.println("Month: " + month2);  
    }
}
