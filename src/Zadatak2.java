import java.util.Scanner;

//Mateja Petkovic
public class Zadatak2 {
    public static void main(String[] args) {
//2. Napraviti program koji, koristeci WHILE petlju, racuna proizvod unetih brojeva sve dok korisnik ne unese 0

        Scanner sc = new Scanner(System.in);
        int proizvod = 1;
        int a = 1;
        while (a!=0) {
            //Ovaj while uslov je nevazan za program, jer ako dole ne iskoristim break; proizvod ce biti 0


            System.out.print("Unesite broj (unesite 0 da zaustavite program): ");
            a = sc.nextInt();
            if(a == 0) {
                break;
            }
            proizvod = proizvod * a;
        }
        System.out.println("Ukupan proizvod unetih brojeva je " + proizvod);
    }
}
