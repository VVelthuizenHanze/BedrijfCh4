package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Sla de gegevens van werknemers van ons bedrijf op
 */
public class Persoon {
    private static double GRENSWAARDE_BONUS = 4500.0;

    public static int aantalPersonen = 0;

    private int personeelsNummer;
    private String naam;
    private String woonplaats;
    private double maandSalaris;
    private Afdeling afdeling;

    public Persoon(String naam, String woonplaats, double maandSalaris, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandSalaris = maandSalaris;
        this.afdeling = afdeling;

        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam, "Onbekend", 0.0, new Afdeling());
    }

    public Persoon() {
        this("Onbekend");
    }

    public double berekenJaarInkomen() {
        return 12 * maandSalaris;
    }

    public boolean heeftRechtOpBonus() {
        return maandSalaris >= GRENSWAARDE_BONUS;
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }
}
