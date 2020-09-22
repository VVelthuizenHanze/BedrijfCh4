package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Uitwerking van opdracht
 * <p>
 * Doel:
 */
public class Werknemer extends Persoon {
    private static final double GRENSWAARDE_BONUS = 4500.0;

    private double maandSalaris;

    public Werknemer(String naam, String woonplaats, Afdeling afdeling, double maandSalaris) {
        super(naam, woonplaats, afdeling);
        this.maandSalaris = maandSalaris;
    }

    public Werknemer(String naam) {
        super(naam);
        this.maandSalaris = 0;
    }

    public Werknemer() {
        this(DEFAULTWAARDE_NAAM);
    }

    public boolean heeftRechtOpBonus() {
        return maandSalaris >= GRENSWAARDE_BONUS;
    }

    @Override
    public double berekenJaarInkomen() {
        if (heeftRechtOpBonus()) {
            return 13 * maandSalaris;
        } else {
            return 12 * maandSalaris;
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" en is een werknemer %s recht op een bonus",
                heeftRechtOpBonus() ? "met" : "zonder");
    }
}
