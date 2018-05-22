import java.time.LocalDate;

/**
 * @author  kchardy
 */

public class Date {

    public enum DzienTygodnia {NIEDZIELA, PONIEDZIALEK, WTOREK, SRODA, CZWARTEK, PIATEK, SOBOTA};

    /**
     * funkcja za pomoca odpowiedniego algorytmu wylicza dzien tygodnia
     * @param data jest to parametr podany przez użytkownika w zmiennej typu LocalDate
     * @return nazwę odpowiedniego dnia tygodnia
     */
    public static DzienTygodnia jakiToDzien(LocalDate data)
    {
        int dzien = data.getDayOfMonth();
        int miesiac = data.getMonthValue();
        int rok = data.getYear();
        int wynik = 0, z ,c;

        if(miesiac<3)
        {
            z = rok -1;
            c = 0;
        }
        else
        {
            z = rok;
            c = 2;
        }

        wynik = ((23*miesiac/9) + dzien + 4 + rok + (z/4) - (z/100) + (z/400) - c) % 7;

        return (DzienTygodnia.values()[wynik]);

    }
}
