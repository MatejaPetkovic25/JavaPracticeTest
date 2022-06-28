public class Zadatak4 {
    public static void main(String[] args) {
//4. Napraviti program koji uzme kreiran niz i napravi drugi niz od postojeceg samo sa obrnutim redosledom clanova
//Na primer ako prvi niz ima clanove {1,2,3} onda drugi niz treba da ima clanove {3,2,1}

        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] niz2 = new int[niz1.length];
        int indeks = (niz1.length - 1);
        for (int i = 0; i < niz1.length; i++) {
            niz2[indeks] = niz1[i];
            indeks --;
        }
        for(int i = 0; i < niz2.length; i++) {
            System.out.print (niz2[i] + ", ");
        }
    }
}
