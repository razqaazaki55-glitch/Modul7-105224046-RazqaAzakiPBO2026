import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<PerangkatPintar> daftar = new ArrayList<>();
        daftar.add(new LampuPintar());
        daftar.add(new AcPintar());

        System.out.println("=== Aktivasi Perangkat ===");
        for (PerangkatPintar p : daftar) {
            p.aktifkan();
        }

        // SOAL 4: Downcasting
        System.out.println("\n=== Pengaturan AC ===");
        for (PerangkatPintar p : daftar) {
            if (p instanceof AcPintar) {
                AcPintar ac = (AcPintar) p;
                ac.aturSuhu(20);
            }
        }
    }
}

//soal no. 5 
/* PerangkatPintar alat = new LampuPintar();
alat.aturKecerahan(75, "Putih"); // mengalami error karena metode aturKecerahan tidak ditemukan di kelas PerangkatPintar
Penyebab:
Karena tipe referensi adalah PerangkatPintar, bukan LampuPintar.
Solusi:
1. Downcasting. yang 
PerangkatPintar alat = new LampuPintar();
        if (alat instanceof LampuPintar) {
            LampuPintar lampu = (LampuPintar) alat;
            lampu.aturKecerahan(75, "Putih");
        }

2. Ganti langsung menggunakan tipe LampuPintar.
 LampuPintar lampu2 = new LampuPintar();
        lampu2.aturKecerahan(60, "Kuning");

*/
