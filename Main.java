public class Main {
    public static void main(String[] args) {
        SistemParkir sistemParkir = new SistemParkir();
        sistemParkir.inisialisasiParkiran(5);

        PetugasParkir petugasParkir = new PetugasParkir();

        Kendaraan kendaraan1 = new Kendaraan();
        kendaraan1.nomorPlat = "AB 1234 CD";
        kendaraan1.jenisKendaraan = "Mobil";

        Pengemudi pengemudi1 = new Pengemudi();
        pengemudi1.nama = "Glen";
        pengemudi1.nomorKontak = "081234567890";

        petugasParkir.parkirkanKendaraan(kendaraan1, pengemudi1, sistemParkir.slotParkir);

        Kendaraan kendaraan2 = new Kendaraan();
        kendaraan2.nomorPlat = "XY 5678 Z";
        kendaraan2.jenisKendaraan = "Motor";

        Pengemudi pengemudi2 = new Pengemudi();
        pengemudi2.nama = "Tarigan";
        pengemudi2.nomorKontak = "081234567891";

        petugasParkir.parkirkanKendaraan(kendaraan2, pengemudi2, sistemParkir.slotParkir);

        petugasParkir.keluarkanKendaraan(kendaraan1, sistemParkir.slotParkir);
        petugasParkir.keluarkanKendaraan(kendaraan2, sistemParkir.slotParkir);
    }
}
