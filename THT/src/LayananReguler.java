public class LayananReguler extends LayananEkspedisi {
    public LayananReguler(String nomorResi, double beratAktualKg,double panjang, double lebar, double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }
 
    // Overriding: tarif dasar Rp 15.000 per Kg
    @Override
    public double hitungOngkir() {
        return hitungBeratEfektif() * 15000;
    }
 
    // Overloading: dengan parameter isMember dan jarakKm
    public double hitungOngkir(boolean isMember, int jarakKm) {
        double tarifDasar = hitungOngkir(); // panggil override di atas
 
        double tarifSetelahDiskon = tarifDasar;
        if (isMember) {
            tarifSetelahDiskon = tarifDasar * 0.10; // diskon 10%
        }
 
        double surcharge = 500.0 * jarakKm;
        return tarifSetelahDiskon + surcharge;
    }
}

