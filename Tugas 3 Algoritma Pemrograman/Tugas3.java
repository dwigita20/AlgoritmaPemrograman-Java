import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        // Array untuk menyimpan gaji sesuai golongan
        int[] gaji = {5000000, 6500000, 9500000};
        // Persen lembur untuk jam lembur
        int[] persenLembur = {30, 32, 34, 36, 38};

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("PROGRAM JAVA");
        System.out.println("PERHITUNGAN GAJI KARYAWAN");
        System.out.println("=================================");

        // Input golongan karyawan
        System.out.println("Masukan golongan (A/B/C): ");
        String golongan = scanner.nextLine().toUpperCase();

        // Input jam lembur
        System.out.println("Masukan jam lembur: ");
        int jamLembur = scanner.nextInt();

        // Menentukan indeks golongan
        int indexGolongan = -1;
        if (golongan.equals("A")) {
            indexGolongan = 0;
        } else if (golongan.equals("B")) {
            indexGolongan = 1;
        } else if (golongan.equals("C")) {
            indexGolongan = 2;
        } else {
            System.out.println("Golongan Tidak Valid!!!");
            return;
        }
        // Menghitung gaji pokok
        int gajiPokok = gaji[indexGolongan];

        // Menghitung gaji lembur
        double gajiLembur = 0;
        if (jamLembur == 1) {
            gajiLembur = gajiPokok * persenLembur[0] / 100.0;
        } else if (jamLembur == 2) {
            gajiLembur = gajiPokok * persenLembur[1] / 100.0;
        } else if (jamLembur == 3) {
            gajiLembur = gajiPokok * persenLembur[2] / 100.0;
        } else if (jamLembur == 4) {
            gajiLembur = gajiPokok * persenLembur[3] / 100.0;
        } else if (jamLembur == 5) {
            gajiLembur = gajiPokok * persenLembur[4] / 100.0;
        }

        // Menghitung total penghasilan
        double totalPenghasilan = gajiPokok + gajiLembur;

        // Menampilkan hasil
        System.out.println("Jumlah penghasilan: Rp" + totalPenghasilan);
    }
}


