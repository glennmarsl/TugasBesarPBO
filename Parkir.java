class Kendaraan {
    String nomorPlat;
    String jenisKendaraan;
}
class Pengemudi {
    String nama;
    String nomorKontak;
}
class SlotParkir {
    boolean terisi;
    Kendaraan kendaraan;

    SlotParkir() {
        terisi = false;
        kendaraan = null;
    }
}
class PetugasParkir {
    void parkirkanKendaraan(Kendaraan kendaraan, Pengemudi pengemudi, SlotParkir[] slotParkir) {
        int slotKosong = cariSlotKosong(slotParkir);

        if (slotKosong != -1) {
            slotParkir[slotKosong].terisi = true;
            slotParkir[slotKosong].kendaraan = kendaraan;
            System.out.println("Kendaraan dengan nomor plat " + kendaraan.nomorPlat + " berhasil diparkir di slot " + slotKosong);
        } else {
            System.out.println("Maaf, parkiran penuh. Tidak dapat parkirkan kendaraan.");
        }
    }

    void keluarkanKendaraan(Kendaraan kendaraan, SlotParkir[] slotParkir) {
        for (int i = 0; i < slotParkir.length; i++) {
            if (slotParkir[i].terisi && slotParkir[i].kendaraan == kendaraan) {
                slotParkir[i].terisi = false;
                slotParkir[i].kendaraan = null;
                System.out.println("Kendaraan dengan nomor plat " + kendaraan.nomorPlat + " berhasil dikeluarkan dari slot " + i);
                return;
            }
        }
        System.out.println("Kendaraan dengan nomor plat " + kendaraan.nomorPlat + " tidak ditemukan di parkiran.");
    }

    private int cariSlotKosong(SlotParkir[] slotParkir) {
        for (int i = 0; i < slotParkir.length; i++) {
            if (!slotParkir[i].terisi) {
                return i;
            }
        }
        return -1;
    }
}
class SistemParkir {
    SlotParkir[] slotParkir;

    void inisialisasiParkiran(int jumlahSlot) {
        slotParkir = new SlotParkir[jumlahSlot];
        for (int i = 0; i < jumlahSlot; i++) {
            slotParkir[i] = new SlotParkir();
        }
        System.out.println("Parkiran berhasil diinisialisasi dengan " + jumlahSlot + " slot.");
    }

    int cariSlotKosong() {
        for (int i = 0; i < slotParkir.length; i++) {
            if (!slotParkir[i].terisi) {
                return i;
            }
        }
        return -1;
    }

    void updateStatusParkiran(int slot, boolean terisi) {
        if (slot >= 0 && slot < slotParkir.length) {
            slotParkir[slot].terisi = terisi;
            System.out.println("Status slot parkir " + slot + " berhasil diperbarui.");
        } else {
            System.out.println("Slot parkir tidak valid.");
        }
    }
}
