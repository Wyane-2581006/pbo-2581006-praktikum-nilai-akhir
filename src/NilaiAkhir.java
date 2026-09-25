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

        double nilai_akhir =  nilai_Prak * BOBOT_PRAK  + nilai_Tugas * BOBOT_TUGAS + nilai_Mid * BOBOT_MID + nilai_Final * BOBOT_FINAL;
        //  Kurung tidak diperlukan karena operator perkalian (*) memiliki precedence lebih tinggi daripada penjumlahan (+), sehingga perkalian otomatis dihitung terlebih dahulu.
        // Hasil menjadi 78 karena semua variabel bertipe int, sehingga pembagian / 100 menghasilkan bilangan bulat dan bagian desimal terpotong.

        int potong = (int) nilai_akhir;
        int pembulatan_Nilaiakhir = (int) Math.round(nilai_akhir);
        double selisih = Math.abs(pembulatan_Nilaiakhir - nilai_akhir);

        System.out.print("Nilai Akhir : " + nilai_akhir);
        System.out.print("\nDipotong : " + potong);
        System.out.print("\nDibulatkan : " + pembulatan_Nilaiakhir);
        System.out.print("\nSelisih : " + selisih);

    }
}
