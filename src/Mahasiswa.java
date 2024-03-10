import java.util.Scanner;

public class Mahasiswa {
    private static  String Nama;
    static  String NIM;
    private static  String Jurusan;

    public Mahasiswa(String Nama, String NIM, String Jurusan) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Jurusan = Jurusan;
    }

    static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }

    static void tampilDataMahasiswa() {
        System.out.println("Nama: " + Nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Jurusan: " + Jurusan);
    }
}