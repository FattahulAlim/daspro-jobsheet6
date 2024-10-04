import java.util.Scanner;

public class pemilihan2percobaan216 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        String member, qris;
        int jumlahBeli, menu;
        double diskon, harga, totalBayar;

        System.out.println("-----------------------------");
        System.out.println("======= Menu Kafe JTI =======");
        System.out.println("-----------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        menu = input16.nextInt();
        input16.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input16.nextLine();
        System.out.print("Apakah pembayaran dilakukan dengan qris (y/n) = ");
        qris = input16.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar Diskon = 10%");

            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan dengan benar");
                return;
            }

            totalBayar = harga - (diskon * harga);

            if (qris.equalsIgnoreCase("y")) {
                totalBayar = totalBayar - 1000;
                System.out.println("Anda mendapatkan potongan 1000Rp karena membayar dengan qris");
            }
            System.out.println("Total bayar setelah diskon = " + totalBayar);

        } else if (member.equalsIgnoreCase("n")) {
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan dengan benar");
                return;
            } 
            if (qris.equalsIgnoreCase("y")) {
                harga = harga - 1000;
                System.out.println("Anda mendapatkan potongan 1000Rp karena membayar dengan qris");
            }
            System.out.println("Total bayar = " + harga);
        } else {
            System.out.println("Member tidak valid");
        } 
    }
}
