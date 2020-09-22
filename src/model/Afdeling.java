package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Sla informatie op over de afdelingen van ons bedrijf
 */
public class Afdeling {
    private String afdelingsNaam;
    private String afdelingsPlaats;

    public Afdeling(String afdelingsNaam, String afdelingsPlaats) {
        this.afdelingsNaam = afdelingsNaam;
        this.afdelingsPlaats = afdelingsPlaats;
    }

    public Afdeling() {
        this("Onbekend", "Onbekend");
    }

    public String getAfdelingsNaam() {
        return afdelingsNaam;
    }

    public String getAfdelingsPlaats() {
        return afdelingsPlaats;
    }
}
