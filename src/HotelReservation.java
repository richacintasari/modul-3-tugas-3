import java.util.Scanner;

public class HotelReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Reservasi Hotel!");
        System.out.print("Masukkan nama tamu: ");
        String namaTamu = scanner.nextLine();

        System.out.println("Pilih tipe kamar:");
        System.out.println("1. Standard (Rp 500.000/malam)");
        System.out.println("2. Deluxe (Rp 750.000/malam)");
        System.out.println("3. Suite (Rp 1.000.000/malam)");
        System.out.print("Masukkan pilihan tipe kamar (1-3): ");
        int tipeKamar = scanner.nextInt();

        System.out.print("Masukkan jumlah malam: ");
        int jumlahMalam = scanner.nextInt();

        double totalHarga = 0;
        if (tipeKamar == 1) {
            totalHarga = 500000 * jumlahMalam;
        } else if (tipeKamar == 2) {
            totalHarga = 750000 * jumlahMalam;
        } else if (tipeKamar == 3) {
            totalHarga = 1000000 * jumlahMalam;
        } else {
            System.out.println("Tipe kamar tidak valid.");
            return;
        }

        System.out.println("=== Detail Reservasi ===");
        System.out.println("Nama Tamu: " + namaTamu);
        System.out.println("Jumlah Malam: " + jumlahMalam);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}
