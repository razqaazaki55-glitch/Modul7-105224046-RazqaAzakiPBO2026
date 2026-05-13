public class LayananEkspedisi {
    protected String nomorResi;
    protected double beratAktualKg;
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    public LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double hitungBeratEfektif(){
        double beratVolumetrik = (panjang * lebar * tinggi) / 6000.0;
        
        if (beratAktualKg > beratVolumetrik) {
            return beratAktualKg;
        } else {
            return beratVolumetrik;
        }
    }

    public void cetakResi(){
        System.out.println("Nomor Resi: " + nomorResi);
        System.out.println("Berat Efektif: " + hitungBeratEfektif());
    }

    public double hitungOngkir() {
        return 0.0;
    }
}
