/**
 * Třída reprezentuje evidované pojištěné osoby
 */
public class PojistenaOsoba {
    /**
     * Jméno pojištěné osoby
     */
    private final String jmeno;
    /**
     * Příjmení pojištěné osoby
     */
    private final String prijmeni;
    /**
     * Věk pojištěné osoby
     */
    private byte vek;
    /**
     * Telefon na pojištěnou osobu
     */
    private String telefon;

    /**
     * Inicializuje instanci
     * @param jmeno Jméno pojištěné osoby
     * @param prijmeni Příjmení pojištěné osoby
     * @param vek Věk pojištěné osoby
     * @param telefon telefon na pojištěnou osobu
     */
    public PojistenaOsoba(String jmeno, String prijmeni, byte vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    /**
     * Getter pro přístup ke jménu pojištěné osoby
     * @return Jméno pojištěné osoby
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * Getter pro přístup k příjmení pojištěné osoby
     * @return Příjmení pojištěné osoby
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Getter pro přístup k věku pojištěné osoby
     * @return Věk pojištěné osoby
     */
    public byte getVek() {
        return vek;
    }

    /**
     * Getter pro přístup k telefonnímu číslu pojištěné osoby
     * @return Telefon pojištěné osoby
     */
    public String getTelefon() {
        return telefon;
    }

    public String toString(){
        return String.format(jmeno + " " + prijmeni + " " + vek + " " + telefon);
    }
}
