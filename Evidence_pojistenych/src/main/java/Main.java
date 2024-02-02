import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        UzivatelskeRozhrani uzivatelskeRozhrani = new UzivatelskeRozhrani();

        int volba = 0;
        String pokracovat = ""; // Proměnná pokračovat slouží k odentrování a pokračování programu

        while (volba != 4) {
            System.out.println("-----------------------------");
            System.out.println("Evidence pojištěných");
            System.out.println("-----------------------------");
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");

            // Snaží se zachytit chybu při volbě uživatele tak, aby uživatel nevložil jiný vstup než číslice 1-4
            volba = 0;
            while (volba < 1 || volba > 4) {
                try {
                    volba = Integer.parseInt(sc.nextLine());
                    if (volba < 1 || volba > 4) {
                        System.out.println("Neplatná volba, zvolte prosím možnost 1-4");
                    }
                } catch (Exception e) {
                    System.out.println("Neplatná volba, zvolte prosím možnost 1-4");
                }
            }

            switch (volba) {
                case 1:
                    String jmeno = "";

                    // Kontrola, aby nebyl zadán prázdný řetězec
                    while (jmeno.isEmpty()) {
                        System.out.println("Zadejte jméno pojištěného:");
                        jmeno = sc.nextLine().trim();
                        if (jmeno.isEmpty()) {
                            System.out.println("Jméno musí být vyplněno!");
                        }
                    }

                    //Kontrola, aby nebyl zadán prázdný řetězec
                    String prijmeni = "";
                    while (prijmeni.isEmpty()) {
                        System.out.println("Zadejte příjmení pojištěného:");
                        prijmeni = sc.nextLine().trim();
                        if (prijmeni.isEmpty()) {
                            System.out.println("Příjmení musí být vyplněno!");
                        }
                    }

                    //Kontrola, aby mělo telefonní číslo správný počet čísel
                    String telefon = "";
                    while (telefon.length() != 14) {
                        System.out.println("Zadejte telefonní číslo:");
                        System.out.print("+420 ");
                        telefon = "+420 " + sc.nextLine().trim();
                        if (telefon.length() != 14) {
                            System.out.println("Délka telefonního čísla musí být 9 znaků!");
                        }
                    }

                    //Kontrola, aby byly zadané pouze číslice a aby číslo, nebylo nesmyslné.
                    byte vek = -1;
                    while (vek < 0 || vek > 120) {
                        try {
                            System.out.println("Zadejte věk:");
                            vek = Byte.parseByte(sc.nextLine());
                            if (vek < 0 || vek > 120) {
                                System.out.println("Neplatná volba číslo je příliš malé, nebo příliš velké.");
                                System.out.println("Zadejte prosím věk pojištěného");
                            }
                        } catch (Exception e) {
                            System.out.println("Neplatná volba, věk se musí skládat pouze z číselných znaků.");
                        }
                    }
                    uzivatelskeRozhrani.pridejPojisteneho(jmeno, prijmeni, telefon, vek);
                    System.out.println("Pro pokračování stiskněte Enter");
                    pokracovat = sc.nextLine();
                    break;
                case 2:
                    System.out.println();
                    uzivatelskeRozhrani.vypisPojisteneho();
                    System.out.println("Pro pokračování stiskněte Enter");
                    pokracovat = sc.nextLine();
                    break;
                case 3:
                    System.out.println("Zadejte jméno pojištěného:");
                    jmeno = sc.nextLine();
                    System.out.println("Zadejte příjmení pojištěného:");
                    prijmeni = sc.nextLine();
                    System.out.println();
                    uzivatelskeRozhrani.vyhledej(jmeno, prijmeni);
                    System.out.println("Pro pokračování stiskněte Enter");
                    pokracovat = sc.nextLine();
                    break;
            }
        }
    }
}
