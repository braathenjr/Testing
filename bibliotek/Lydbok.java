
/**
 * Lydbok, subclass of Bok.
 *
 * @author (Per Lauvås)
 * @version (1)
 */
public class Lydbok extends Bok
{
    private int antallMinutter;
    private int antallDisker;
    private String oppleser;
    public Lydbok() {
    }

    public Lydbok(String isbn, String forfatter, String tittel, String forlag,
    int antallInne, int antallRegistrert, int antallMinutter, int antallDisker, String oppleser) {
        super(isbn, forfatter, tittel, forlag, antallInne, antallRegistrert);
        setAntallMinutter(antallMinutter);
        setAntallDisker(antallDisker);
        setOppleser(oppleser);
    }

    public void setAntallMinutter(int antallMinutter) {
        this.antallMinutter = antallMinutter;
    }

    public void setAntallDisker(int antallDisker) {
        this.antallDisker = antallDisker;
    }

    public void setOppleser(String oppleser) {
        this.oppleser = oppleser;
    }

    public int getAntallMinutter() {
        return antallMinutter;
    }

    public int getAntallDisker() {
        return antallDisker;
    }

    public String getOpplesrer() {
        return oppleser;
    }
}
