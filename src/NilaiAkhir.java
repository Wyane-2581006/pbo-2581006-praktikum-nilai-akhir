import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bobot_Prak = 0.30;
        double bobot_Tugas = 0.20;
        double bobot_Mid = 0.20;
        double bobot_Final = 0.30;

        System.out.print("Masukkan Nilai Praktikum : ");
        double nilai_Prak = scanner.nextDouble();

        System.out.print("Masukkan Nilai Tugas : ");
        double nilai_Tugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai MID : ");
        double nilai_Mid = scanner.nextDouble();

        System.out.print("Masukkan Nilai Final : ");
        double nilai_Final = scanner.nextDouble();


    }
}
