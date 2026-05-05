//Soal no.1
class PerangkatPintar {
    void aktifkan() {
        System.out.println("Perangkat pintar diaktifkan.");
    }
}

//soal no.2
class LampuPintar extends PerangkatPintar {

    //overriding
    @Override
    void aktifkan() {
        System.out.println("Lampu menyala dengan tingkat kecerahan standar.");
    }

    void aturKecerahan(int level) {
        System.out.println("Kecerahan lampu diatur ke level " + level + "%.");
    }

    void aturKecerahan(int level, String warna) {
        System.out.println("Kecerahan lampu diatur ke level " + level + "% dengan warna " + warna + ".");
    }
}

//soal no.3
class AcPintar extends PerangkatPintar {
    //overriding
    @Override
    void aktifkan() {
        System.out.println("AC menyala dan mulai mendinginkan ruangan.");
    }

    // SOAL 4 Method khusus
    void aturSuhu(int suhu) {
        System.out.println("Suhu ruangan diatur menjadi " + suhu + " derajat.");
    }
}
