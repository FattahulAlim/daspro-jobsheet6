import java.util.Scanner;

public class tugas1pertemuan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3;

        System.out.print("Masukkan bilangan pertama anda: ");
        bil1 = sc.nextInt();

        System.out.print("Masukkan bilangan kedua anda: ");
        bil2 = sc.nextInt();

        System.out.print("Masukkan bilangan terakhir anda: ");
        bil3 = sc.nextInt();

        if (bil1 > bil2 && bil1 > bil2) {
            System.out.println("Bilangan 1 merupakan bilangan terbesar");
        } else if (bil2 > bil1 && bil2 > bil3) {
            System.out.println("Bilangan 2 merupakan bilangan terbesar");
        } else if (bil3 > bil1 && bil3 > bil2 ) {
            System.out.println("Bilangan 3 merupakan bilangan terbesar");
        } else {
            System.out.println("Invalid number");
        }
    }
}
