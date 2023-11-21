import java.util.Scanner;

public class hitungNilaiModif {
    static int[][] nilaiMahasiswa;
    static String[] namaMahasiswa;

    public static void inputDataNilai(int jumlahMahasiswa, int jumlahTugas) {
        Scanner scanner = new Scanner(System.in);
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];
        namaMahasiswa = new String[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.next();
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + " (tugas ke-1 sampai ke-" + jumlahTugas + "):");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilkanNilaiMahasiswa(int jumlahMahasiswa, int jumlahTugas) {
        System.out.println("Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int hariDenganNilaiTertinggi(int jumlahMahasiswa, int jumlahTugas) {
        int[] totalNilaiHarian = new int[jumlahTugas];
        for (int j = 0; j < jumlahTugas; j++) {
            int total = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                total += nilaiMahasiswa[i][j];
            }
            totalNilaiHarian[j] = total;
        }

        int hariTertinggi = 0;
        int nilaiTertinggi = totalNilaiHarian[0];
        for (int j = 1; j < jumlahTugas; j++) {
            if (totalNilaiHarian[j] > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiHarian[j];
                hariTertinggi = j;
            }
        }
        return hariTertinggi + 1; // Karena indeks dimulai dari 0
    }

    public static void tampilkanMahasiswaNilaiTertinggi(int jumlahMahasiswa, int jumlahTugas) {
        int hariTertinggi = hariDenganNilaiTertinggi(jumlahMahasiswa, jumlahTugas);
        int nilaiTertinggi = 0;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalNilai = 0;
            for (int j = 0; j < jumlahTugas; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }
            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalNilai = 0;
            for (int j = 0; j < jumlahTugas; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }
            if (totalNilai == nilaiTertinggi) {
                System.out.println(namaMahasiswa[i] + " (Total Nilai: " + nilaiTertinggi + ")");
                System.out.println("Detail Nilai:");
                for (int j = 0; j < jumlahTugas; j++) {
                    System.out.println("Tugas ke-" + (j + 1) + ": " + nilaiMahasiswa[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = scanner.nextInt();

        inputDataNilai(jumlahMahasiswa, jumlahTugas);
        tampilkanNilaiMahasiswa(jumlahMahasiswa, jumlahTugas);

        int hariTertinggi = hariDenganNilaiTertinggi(jumlahMahasiswa, jumlahTugas);
        System.out.println("Hari dengan nilai tertinggi dari keseluruhan mahasiswa adalah: Tugas ke-" + hariTertinggi);

        tampilkanMahasiswaNilaiTertinggi(jumlahMahasiswa, jumlahTugas);
    }
}

