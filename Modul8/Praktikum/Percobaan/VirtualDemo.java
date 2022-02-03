package Modul8.Praktikum.Percobaan;

public class VirtualDemo {
    public static void main(String[] args){
        Gaji s = new Gaji("WAHYU", "KUBAR", 3,5000.00);
        Pegawai e = new Gaji("Ini Nama", "SAMARINDA",2, 2500.00);
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji--");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
    }
}
/*
 * Output program di atas mempunyai statement yang berbeda
 * Walaupun memiliki method yang sama yaitu "Method mailCheck"
 */