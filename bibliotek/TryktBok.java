
/**
 * TryktBok, a subclass of Bok.
 *
 * @author (Per Lauvås)
 * @version (1)
 */
public class TryktBok extends Bok
{
    private int antallSider;
    public TryktBok() {
    }

    public TryktBok(String isbn, String forfatter, String tittel, String forlag,
    int antallInne, int antallRegistrert, int antallSider) {
        super(isbn, forfatter, tittel, forlag, antallRegistrert, antallInne);
        setAntallSider(antallSider);
    }

    public void setAntallSider(int antallSider) {
        this.antallSider = antallSider;
    }

    public int getAntallSider() {
        return antallSider;
    }

}
