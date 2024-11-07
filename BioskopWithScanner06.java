import java.util.Scanner;

public class BioskopWithScanner06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        int pilihan;

        do {
            // Menampilkan menu
            System.out.println("=== Menu ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = sc.nextInt();
            sc.nextLine(); // membersihkan newline

            switch (pilihan) {
                case 1:
                    // Input data penonton
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();

                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); // membersihkan newline

                        // Validasi input baris dan kolom
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris dan kolom harus dalam rentang yang valid (Baris 1-4, Kolom 1-2).");
                            continue; // kembali ke awal loop input
                        }

                        // Cek apakah kursi sudah terisi
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                            continue; // kembali ke awal loop input
                        }

                        // Menyimpan nama penonton
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan.");

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break; // keluar dari loop input
                        }
                    }
                    break;

                case 2:
                    // Tampilkan daftar penonton
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            // Ganti null dengan ***
                            String penontonName = (penonton[i][j] != "***") ? penonton[i][j] : "***";
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penontonName);
                        }
                    }
                    break;

                case 3:
                    // Exit
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
            System.out.println();
        } while (pilihan != 3);

        sc.close();
    }
}