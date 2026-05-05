import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //Buat ArrayList bertipe superclass (Upcasting)
        ArrayList<MetodePembayaran> daftar = new ArrayList<>();

        //Masukkan objek
        daftar.add(new EWallet());
        daftar.add(new KartuKredit());

        // Membuat Looping
        for (MetodePembayaran mp : daftar) {

            //Runtime Polymorphism
            mp.bayar(100000);

            //instanceof dan Downcasting
            if (mp instanceof EWallet) {
                EWallet ew = (EWallet) mp;
                ew.bayar(100000, "08123456789"); // overload
            } 
            else if (mp instanceof KartuKredit) {
                KartuKredit kk = (KartuKredit) mp;
                kk.verifikasiPIN();
            }

            System.out.println("----------------------");
        }
    }
}