import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//3. Napraviti program koji racuna koliko puta se neki broj pojavljuje u nizu.
// Korisnik preko skenera unese koji broj zeli da prebroji u nizu

        Scanner sc = new Scanner(System.in);
        int[] niz = {2, 5, 7, 2, 4, 3, 5, 4, 7, 7, 2, 7, 2, 2, 1};
        System.out.print("Unesite broj koji zelite da prebrojite u nizu: ");
        int broj = sc.nextInt();
        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {

            if (niz[i] == broj) {
                brojac++;
            }

        }
        System.out.println("Vas broj (" + broj + ") se pojavio " + brojac + " puta u nizu.");
    }
}
