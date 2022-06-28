//Mateja Petkovic
public class Zadatak1 {
    public static void main(String[] args) {
        //1. Napraviti program koji nalazi najveci broj u nizu i vraca informaciju da li je taj najveci broj paran

        int[] niz = {10, 20, 40, 33, 12, 16, 19, 24, - 4, -6, 7};
        int max = niz[0];

        for(int i = 0; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
        }

        if (max %2 == 0) {
            System.out.println("Broj je paran.");
        } else {
            System.out.println("Broj je neparan.");
        }
        System.out.println("Najveci broj u nizu je " + max + ".");

    }
}
