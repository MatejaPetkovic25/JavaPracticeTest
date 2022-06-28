import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//5. Napisati program koji racuna potrosnju goriva. Korisnik unosi distancu, tip vozila i tip goriva,
// a program ispisuje koliko ce goriva biti potroseno i koja je ukupna cena.
//Motor trosi 5 litara na 100 km
//Automobil trosi 9 litara na 100 km
//Kamion trosi 15 litara na 100 km
//Tipovi goriva su:
//Benzin kosta 170 dinara po litru
//Dizel kosta 190 dinara po litru
//Zadatak raditi kroz switch i pokriti samo happy flow uz default

        Scanner sc = new Scanner(System.in);
        System.out.println("Molimo vas unesite sve informacije precizno malim slovima.");
        System.out.print("Unesite predjenu distancu (samo broj, racuna se u km): ");
        double distanca = sc.nextDouble();
        System.out.print("Unesite tip vozila: ");
        String vozilo = sc.next();
        System.out.print("Unesite tip goriva: ");
        String gorivo = sc.next();
        double potrosnja = 0;
        double cena = 0;

        switch(vozilo) {
            case "motor" :
                potrosnja = distanca * 5 / 100;
                if (gorivo.equals("benzin")) {
                    cena = potrosnja * 170;
                } else if (gorivo.equals("dizel")) {
                    cena = potrosnja * 190;
                }
                break;
            case "automobil":
                potrosnja = distanca * 9 / 100;
                if (gorivo.equals("benzin")) {
                    cena = potrosnja * 170;
                } else if (gorivo.equals("dizel")) {
                    cena = potrosnja * 190;
                }
                break;
            case "kamion":
                potrosnja = distanca * 15 / 100;
                if (gorivo.equals("benzin")) {
                    cena = potrosnja * 170;
                } else if (gorivo.equals("dizel")) {
                    cena = potrosnja * 190;
                }
                break;
            default:
                System.out.println("Niste uneli ispravne podatke!");
                break;
        }
        System.out.println("Ukupno cete potrositi " + potrosnja + " litara goriva, tako da je cena putovanja " + cena + "RSD.");


    }
}
