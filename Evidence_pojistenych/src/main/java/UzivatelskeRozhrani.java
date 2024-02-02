import java.util.HashSet;
import java.util.Set;

/**
 * Třída reprezentuje uživatelské rozhraní
 */
public class UzivatelskeRozhrani {
    /**
     * Instance třídy Pojistene osoby
     */
    PojistenaOsoba pojistenaOsoba;
    /**
     * Založení kolekce do níž se ukládají pojištěné osoby
     */
    Set<PojistenaOsoba> pojisteneOsobySet = new HashSet<>();

    /**
     * Přidá pojištěnou osobu a uloží ji do kolekce
     * @param jmeno Jméno pojištěné osoby
     * @param prijmeni Příjmení pojištěné osoby
     * @param telefon Telefon pojištěné osoby
     * @param vek Věk pojištěné osoby
     */
    public void pridejPojisteneho(String jmeno, String prijmeni, String telefon, byte vek) {
        pojisteneOsobySet.add(pojistenaOsoba = new PojistenaOsoba(jmeno, prijmeni, vek, telefon));
    }

    /**
     * Metoda pro vypsání uložených osob
     */
    public void vypisPojisteneho(){
        for (PojistenaOsoba osoba : pojisteneOsobySet) {
            System.out.println(osoba);
        }
    }

    /**
     * Vyhledá pojištěnou osobu na základě vstupních parametrů
     * @param jmeno Jméno pojištěné osoby
     * @param prijmeni příjmení pojištěné osoby
     * @return Vyhledaná osoba
     */
    public void vyhledej(String jmeno, String prijmeni) {
        for (PojistenaOsoba osoba : pojisteneOsobySet) {
            if (osoba.getJmeno().toLowerCase().equals(jmeno.toLowerCase()) && osoba.getPrijmeni().toLowerCase().equals(prijmeni.toLowerCase())) {
                System.out.println(osoba);
            }
        }
    }
}
