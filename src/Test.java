import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;

/**
 * @author  kchardy
 */

public class Test {

    public static void main(String[] args) throws IOException {


        LocalDate localDate = LocalDate.now();

        System.out.println(Date.jakiToDzien(localDate));
        System.out.println(Date.jakiToDzien(LocalDate.of(1969, Month.JULY, 20)));
        System.out.println(Date.jakiToDzien(LocalDate.of(1996, Month.JANUARY, 6)));




    }
}
