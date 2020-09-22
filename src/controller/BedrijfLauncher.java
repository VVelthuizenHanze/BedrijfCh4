package controller;

import model.Persoon;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 *
 * Voer de een bedrijfsadministratie uit.
 */
public class BedrijfLauncher {

    public static void main(String[] args) {
        System.out.println(Persoon.aantalPersonen);
        Persoon baas = new Persoon("Mark", "Den Haag", 10000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(baas.getPersoneelsNummer());

        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(medewerker.getPersoneelsNummer());

        Persoon assistent = new Persoon ("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);

        System.out.printf("%s verdient %.2f en heeft %s recht op een bonus.\n",
                baas.getNaam(),
                baas.getMaandSalaris(),
                baas.heeftRechtOpBonus() ? "wel" : "geen"); // deze is nieuwe
                /*
                    Deze operator heet de ternary operator (drievoudige operator).
                    Het is een soort mini if-else, voor het vraagteken staat een boolean
                    als die true is wordt het middelste teruggegeven, anders het laatste.

                    Het levert hier elegante code op (vind ik) al kun je het ook "gewoon"
                    met een if-else doen!
                 */
        System.out.printf("%s verdient %.2f en heeft %s recht op een bonus.\n",
                medewerker.getNaam(),
                medewerker.getMaandSalaris(),
                medewerker.heeftRechtOpBonus() ? "wel" : "geen");
    }
}
