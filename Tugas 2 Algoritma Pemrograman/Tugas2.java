import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("PROGRAM JAVA");
        System.out.println("PERHITUNGAN GAJI KARYAWAN");
        System.out.println("===============================");

        System.out.print("Masukkan Golongan (A/B/C): ");
        char golongan = input.next().toUpperCase().charAt(0);

        System.out.print("Masukkan Jam Lembur: ");
        int jamLembur = input.nextInt();

        double gajiPokok = 0;
        double gajiLembur;

        // Menghitung Gaji Pokok Berdasarkan Golongan
        if (golongan == 'A') {
            gajiPokok = 5000000;
        }
        else if (golongan == 'B') {
            gajiPokok = 6500000;
        }
        else if (golongan == 'C') {
            gajiPokok = 9500000;
        }

        // Menghitung Gaji Lembur Berdasarkan Jam Lembur
        if (jamLembur == 0) {
            gajiLembur = gajiPokok * 0;
        }
        else if (jamLembur == 1) {
            gajiLembur = gajiPokok * 0.30;
        }
        else if (jamLembur == 2) {
            gajiLembur = gajiPokok * 0.32;
        }
        else if (jamLembur == 3) {
            gajiLembur = gajiPokok * 0.34;
        }
        else if (jamLembur == 4) {
            gajiLembur = gajiPokok * 0.36;
        }
        else { // untuk jam lembur 5 jam atau lebih
            gajiLembur = gajiPokok * 0.38;
        }

        // Menghitung Total Penghasilan
        double totalPenghasilan = gajiPokok + gajiLembur;

        // Output Total Penghasilan
        System.out.println("Total Penghasilan Rp." + totalPenghasilan);

        input.close();

        System.out.println("===============================");
    }
}
