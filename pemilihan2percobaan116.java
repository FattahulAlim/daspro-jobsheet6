import java.util.Scanner;

public class pemilihan2percobaan116 {

    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        int tahun;
        System.out.print("Tahun ke berapa: ");
        tahun = input16.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
            } else {
                System.out.println("Tahun kabisat");
            }
        } else
            System.out.println("Bukan tahun kabisat");
    }
}