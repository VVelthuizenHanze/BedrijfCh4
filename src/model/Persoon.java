package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Sla de gegevens van werknemers van ons bedrijf op
 */
public class Persoon {
    protected static final String DEFAULTWAARDE_NAAM = "Onbekend";

    public static int aantalPersonen = 0;

    private int personeelsNummer;
    private String naam;
    private String woonplaats;
    private Afdeling afdeling;

    public Persoon(String naam, String woonplaats, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.afdeling = afdeling;

        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam, "Onbekend", new Afdeling());
    }

    public Persoon() {
        this(DEFAULTWAARDE_NAAM);
    }

    public double berekenJaarInkomen() {
        return 0;
    }

    public String getNaam() {
        return naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }

    @Override
    public String toString() {
        return String.format("%s woont in %s en werkt op %s", naam, woonplaats, afdeling);
        // Je zou ook afdeling.toString() kunnen gebruiken om expliciet te maken dat je toString wil gebruiken
        // nu is dat impliciet.
    }
}
