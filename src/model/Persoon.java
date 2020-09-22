package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Sla de gegevens van werknemers van ons bedrijf op
 */
public class Persoon {
    public static int aantalPersonen = 0;

    public int personeelsNummer;
    public String naam;
    public String woonplaats;
    public double maandSalaris;

    public Persoon(String naam, String woonplaats, double maandSalaris) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandSalaris = maandSalaris;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam, "Onbekend", 0.0);
    }

    public Persoon() {
        this("Onbekend");
    }

    public double berekenJaarInkomen() {
        return 12 * maandSalaris;
    }
}
