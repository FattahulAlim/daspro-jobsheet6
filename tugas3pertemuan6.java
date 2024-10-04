import java.util.Scanner;

public class tugas3pertemuan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String merk, kategori;
        int ukuran, harga;

        System.out.print("Mohon masukkan merk sepatu yang ingin anda beli: ");
        merk = sc.nextLine();
        System.out.print("Apa kategori dari merek sepatu teresbut: ");
        kategori = sc.nextLine();
        System.out.print("Berapa ukuran sepatu anda: ");
        ukuran = sc.nextInt();

        if (merk.equalsIgnoreCase("Spec") && kategori.equalsIgnoreCase("Slip On")) {
            if (ukuran >= 36 && ukuran <= 40) {
                harga = 800000;
                System.out.println("Harga sepatu tersebut : " + harga);
            } else {
                System.out.println("Invalid data");
            }
        } else if (merk.equalsIgnoreCase("Spec") && kategori.equalsIgnoreCase("High Top")) {
            if (ukuran >= 40 && ukuran <= 44) {
                harga = 1200000;
                System.out.println("Harga sepatu tersebut : " + harga);
            } else {
                System.out.println("Invalid data");
            }
        } else if (merk.equalsIgnoreCase("910") && kategori.equalsIgnoreCase("Woman")) {
            if (ukuran >= 36 && ukuran <= 41) {
                harga = 1000000;
                System.out.println("Harga sepatu tersebut : " + harga);
            } else {
                System.out.println("Invalid data");
            }
        } else if (merk.equalsIgnoreCase("910") && kategori.equalsIgnoreCase("Man")) {
            if (ukuran >= 41 && ukuran <= 44) {
                harga = 1800000;
                System.out.println("Harga sepatu tersebut : " + harga);
            } else {
                System.out.println("Invalid data");
            }
        } else if (merk.equalsIgnoreCase("Ortus") && kategori.equalsIgnoreCase("Kids")) {
            if (ukuran >= 36 && ukuran <= 40) {
                harga = 750000;
                System.out.println("Harga sepatu tersebut : " + harga);
            } else {
                System.out.println("Invalid data");
            }
        } else if (merk.equalsIgnoreCase("Ortus") && kategori.equalsIgnoreCase("Adult")) {
            if (ukuran >= 40 && ukuran <= 44) {
                harga = 1500000;
                System.out.println("Harga sepatu tersebut : " + harga);
            } else {
                System.out.println("Invalid data");
            }
        } else {
            System.out.println("Invalid data");
        }
    }
}