import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double BOBOT_PRAK = 0.30;
        double BOBOT_TUGAS = 0.20;
        double BOBOT_MID = 0.20;
        double BOBOT_FINAL = 0.30;

        System.out.print("Masukkan Nilai Praktikum : ");
        double nilai_Prak = scanner.nextDouble();

        System.out.print("Masukkan Nilai Tugas : ");
        double nilai_Tugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai MID : ");
        double nilai_Mid = scanner.nextDouble();

        System.out.print("Masukkan Nilai Final : ");
        double nilai_Final = scanner.nextDouble();

        double nilai_akhir = nilai_Prak * BOBOT_PRAK + nilai_Tugas * BOBOT_TUGAS + nilai_Mid * BOBOT_MID;
        nilai_akhir += nilai_Final * BOBOT_FINAL;
        // menggunakan augmented assignemnet pada salah satu rumus
        //  Kurung tidak diperlukan karena operator perkalian (*) memiliki precedence lebih tinggi daripada penjumlahan (+), sehingga perkalian otomatis dihitung terlebih dahulu.
        // Hasil menjadi 78 karena semua variabel bertipe int, sehingga pembagian / 100 menghasilkan bilangan bulat dan bagian desimal terpotong.

        int potong = (int) nilai_akhir;
        int pembulatan_Nilaiakhir = (int) Math.round(nilai_akhir);
        double selisih = Math.abs(pembulatan_Nilaiakhir - nilai_akhir);
        boolean lulus = nilai_akhir >= 60;

        System.out.println("\n==== NILAI AKHIR ====");
        System.out.println("Praktikum : " + nilai_Prak + " (30%)");
        System.out.println("Tugas : " + nilai_Tugas + " (20%)");
        System.out.println("MID : " + nilai_Mid + " (20%)");
        System.out.println("FINAL : " + nilai_Final + " (30%)");
        System.out.println("Nilai Akhir : " + nilai_akhir);
        System.out.println("Dipotong (int) : " + potong);
        System.out.println("Dibulatkan (round) : " + pembulatan_Nilaiakhir);
        System.out.println("Selisih : " + selisih);
        System.out.println("Lulus (>= 60): " + lulus);

        //==== NILAI AKHIR ====
        //Praktikum : 97.0 (30%)
        //Tugas : 96.0 (20%)
        //MID : 88.0 (20%)
        //FINAL : 100.0 (30%)
        //Nilai Akhir : 95.9
        //Dipotong (int) : 95
        //Dibulatkan (round) : 96
        //Selisih : 0.09999999999999432
        //Lulus : true
        //
        //Process finished with exit code 0

    }
}
