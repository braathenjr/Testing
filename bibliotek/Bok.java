
/**
 * Holding information about a book.
 * Part of exercise week 2.
 *
 * @author (Per Lauvås)
 * @version (1)
 */
public class Bok
{
    private String isbn;
    private String forfatter;
    private String tittel;
    private String forlag;
    private int antallInne;
    private int antallRegistrert;
    public Bok() {}

    public Bok(String isbn, String forfatter, String tittel, String forlag,
    int antallInne, int antallRegistrert) {
        setIsbn(isbn);
        setForfatter(forfatter);
        setTittel(tittel);
        setForlag(forlag);
        setAntallInne(antallInne);
        setAntallRegistrert(antallRegistrert);
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public void setForlag(String forlag) {
        this.forlag = forlag;
    }

    public void setAntallInne(int antallInne) {
        this.antallInne = antallInne;
    }

    public void setAntallRegistrert(int antallRegistrert) {
        this.antallRegistrert = antallRegistrert;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getForfatter() {
        return forfatter;
    }

    public String getTittel() {
        return tittel;
    }

    public String getForlag() {
        return forlag;
    }

    public int getAntallInne() {
        return antallInne;
    }

    public int getAntallRegistrert() {
        return antallRegistrert;
    }
    
    public void displayAllInformation(){
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Forfatter: "+ getForfatter());
        System.out.println("Tittel: " + getTittel());
        System.out.println("Forlag: " + getForlag());
        System.out.println("Antall inne: " + getAntallInne());
        System.out.println("Antall Registrert: " + getAntallRegistrert());
    }
}
