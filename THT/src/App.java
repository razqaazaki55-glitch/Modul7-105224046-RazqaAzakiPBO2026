import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //Menyimpan objek layanan ekspedisi dalam ArrayList untuk memanfaatkan konsep polymorphism, sehingga kita dapat menyimpan berbagai jenis layanan ekspedisi yaitu reguler, express, internasional.
        ArrayList<LayananEkspedisi> daftarLayanan = new ArrayList<>();
        //Namun program membuat masing-masing objek memiliki data yang berbeda untuk menunjukkan perbedaan antara layanan ekspedisi reguler, express, dan internasional.
        daftarLayanan.add(new LayananReguler("REG-11", 2, 50, 50, 50));

        daftarLayanan.add(new LayananExpress("EXP-22", 5, 10, 10, 10));

        daftarLayanan.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100));

        double totalPendapatanPerusahaan = 0.0;
        //Melalukan iterasi untuk menelusuri seluruh objek.
        for (LayananEkspedisi layanan : daftarLayanan) {

            layanan.cetakResi();

            double ongkirDasar = layanan.hitungOngkir();
            totalPendapatanPerusahaan += ongkirDasar;
            System.out.printf("Ongkir Dasar    : Rp%.2f%n", ongkirDasar);
            //Melakukan pengecekan jenis objek.
            if (layanan instanceof LayananReguler) {
                LayananReguler reguler = (LayananReguler) layanan;
                double hargaMember = reguler.hitungOngkir(true, 25);
                System.out.printf("[Reguler] Harga Member (diskon 10%% + jarak 25 km): Rp%.2f%n", hargaMember);

            } else if (layanan instanceof LayananExpress) {
                LayananExpress express = (LayananExpress) layanan;
                System.out.print("[Express] ");
                express.klaimAsuransi(1500000);

            } else if (layanan instanceof LayananInternasional) {
                LayananInternasional internasional = (LayananInternasional) layanan;
                System.out.print("[Internasional] ");
                internasional.cetakManifest();
            }
        }
        //Tampilan total pendapatan keseluruhan perusahaan dari ongkir dasar (sebelum promo member/jarak).
        System.out.println("==========================================");
        System.out.printf("Total Pendapatan Perusahaan (ongkir dasar): Rp%.2f%n", totalPendapatanPerusahaan);
        System.out.println("==========================================");
    }
}