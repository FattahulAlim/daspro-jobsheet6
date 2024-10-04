import java.util.Scanner;

public class tugas2pertemuan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hari, jnsBk;
        double hargakms, harganvl, hargalain, diskon;
        int jmlbk;

        hargakms = 50000;
        harganvl = 30000;
        hargalain = 20000;

        System.out.println("Masukkan hari pada saat anda membeli buku: ");
        hari = sc.nextLine();
        System.out.println("berikut daftar harga buku yang kami jual: ");
        System.out.println("Buku kamus: " + hargakms);
        System.out.println("Buku novel: " + harganvl);
        System.out.println("Lainnya : " + hargalain);

        System.out.println("Masukkan jenis buku apa yang hendak anda beli?");
        jnsBk = sc.nextLine();
        System.out.println("Berapa jumlah buku yang akan anda beli: ");
        jmlbk = sc.nextInt();

        if (hari.equalsIgnoreCase("rabu") && jnsBk.equalsIgnoreCase("kamus")) {
            if (jmlbk <= 2) {
                diskon = 0.1;
                System.out.println("anda mendapatkan diskon sebesar 10%");
            } else if (jmlbk > 2) {
                diskon = 0.02;
                System.out.println("anda mendapatkan diskon sebesar 10% + 2%");
            } else {
                System.out.println("Invalid data");
            }

        } else if (hari.equalsIgnoreCase("rabu") && jnsBk.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jmlbk <= 3) {
                diskon = 0.01;
                System.out.println("anda mendapatkan diskon sebesar 7% + 1%");
            } else if (jmlbk > 3) {
                diskon = 0.02;
                System.out.println("anda mendapatkan diskon sebesar 7% + 2%");
            } else {
                System.out.println("Invalid data");
            }
        } else if (hari.equalsIgnoreCase("rabu") && jnsBk.equalsIgnoreCase("lainnya")) {
            if (jmlbk > 3) {
                System.out.println("anda mendapatkan diskon sebesar 5%");
            } else if (jmlbk <= 3) {
                System.out.println("Anda tidak mendapatkan diskon");
            } else {
                System.out.println("Invalid data");
            }
        } else {
            System.out.println("Anda tidak mendapatkan diskon");
        }

    }
}
