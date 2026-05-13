public class LayananInternasional extends LayananEkspedisi {
 
    private String negaraTujuan;
    private double nilaiBarangUSD;
 
    public LayananInternasional(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
        this.negaraTujuan  = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }

    @Override
    public double hitungOngkir(){
        double tarifDasar = hitungBeratEfektif() * 50000; // tarif dasar Rp 50.000 per Kg
        double pajak = tarifDasar * 0.15; // pajak 15%
        return tarifDasar + pajak;
    }

    //Method Spesifik
    public void cetakManifest(){
        System.out.println("Manifest Internasional ke " + negaraTujuan + " Deklarasi Nilai: $" + nilaiBarangUSD);
    }
}