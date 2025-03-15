public class Main {
    public static void main(String[] args) {

        //Membuat dua objek RekeningBank dengan konstruktor default
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        //mengatur nomor rekening untuk rekening1 dan rekening2
        rekening1.nomorRekening = "202410370110179";
        rekening2.nomorRekening = "202410370110169";

        //Mengatur nama pemilik rekening
        rekening1.namaPemilik = "Himam";
        rekening2.namaPemilik = "Kiki";

        //Mengatur saldo awal masing-masing rekening
        rekening1.saldo = 800000;
        rekening2.saldo = 500000;

        //Menampilkan informasi rekening sebelum transaksi
        System.out.println("\n=== Informasi Rekening Sebelum Transaksi ===");
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        //Melakukan transaksi setor uang
        System.out.println("\n=== Transaksi Setor Uang ===");
        rekening1.setorUang(400000);
        rekening2.setorUang(300000);

        //Melakukan transaksi tarik uang
        System.out.println("\n=== Transaksi Tarik Uang ===");
        rekening1.tarikUang(30000);
        rekening2.tarikUang(80000);

        //Menampilkan informasi rekening setelah transaksi
        System.out.println("\n=== Informasi Rekening Setelah Transaksi ===");
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}