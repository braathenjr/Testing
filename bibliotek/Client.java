import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 * Client program for "Bibliotek".
 *
 * @author (Per Lauvås)
 * @version (1)
 */
public class Client
{
    public void mainMethod() {
        ArrayList<Bok> books = new ArrayList<Bok>();

        books.add(new TryktBok("12345", "Joseph Heller", "Cath 22", "Penguin",
                5, 10, 230));
        books.add(new TryktBok("77777", "Linn Ullmann", "Før du sovner", "Oktober",
                2, 3, 130));
        books.add(new TryktBok("23456", "Heide Linde", "Norsk sokkel", "Gyldendal",
                10, 15, 295));
        books.add(new Lydbok("34567", "Linn Ullmann", "De urolige", "Oktober",
                3, 8, 410, 5, "Lisa Kolben"));
        books.add(new Lydbok("45678", "Jan-Philipp Sendker", "Hviskende skygger", "Cappelen Damm",
                1, 4, 352, 8, "Kim Haugen"));

        Set<String> forfattere = new HashSet<String>();
        System.out.println("\n\nAlle bøker:\n");
        for (Bok b : books) {
            b.displayAllInformation();
            System.out.println("\n");
            forfattere.add(b.getForfatter());
        }

        System.out.println("Alle forfattere:\n");
        for(String forfatter : forfattere){
            System.out.println(forfatter);
        }
    }
}
