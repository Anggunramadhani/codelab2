import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int input;

        while (true) {
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Pilihan Anda: ");
            input = inputUser.nextInt();

            if (input == 1) {
                System.out.print("Masukkan nama mahasiswa: ");
                String NamaMahasiswa = inputUser.next();

                while (true) {
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String NIMMahasiswa = inputUser.next();
                    inputUser.nextLine();

                    if (NIMMahasiswa.length() == 15) {
                        System.out.print("Masukkan jurusan mahasiswa: ");
                        inputUser.nextLine();
                        String JurusanMahasiswa = inputUser.nextLine();
                        Mahasiswa mahasiswa = new Mahasiswa(NamaMahasiswa, NIMMahasiswa, JurusanMahasiswa);
                        break;
                    } else {
                        System.out.println("NIM harus minimal 15 digit!");
                    }
                }
                System.out.println("Data Mahasiswa berhasil ditambahkan");
            } else if (input == 2) {
                Mahasiswa.tampilUniversitas();
                Mahasiswa.tampilDataMahasiswa();
            } else if (input == 3) {
                System.out.println("Program Selesai");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1-3.");
            }
        }
    }
}