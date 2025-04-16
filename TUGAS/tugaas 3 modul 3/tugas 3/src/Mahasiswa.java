
class Mahasiswa extends User {


    public Mahasiswa(String nama, String nim) {

        super(nama, nim);
    }


    @Override
    public void login() {

        if (getNama().equalsIgnoreCase("iqodhul himam") && getNim().equals("202410370110179")) {
            System.out.println("Login Mahasiswa berhasil!"); // Pesan sukses jika login berhasil
            System.out.println(); // Baris kosong untuk tampilan lebih rapi
            displayInfo(); // Menampilkan informasi mahasiswa setelah login sukses
        } else {
            System.out.println("Login gagal! Nama atau NIM salah."); // Pesan jika login gagal
        }
    }

    // Metode untuk menampilkan informasi Mahasiswa setelah login berhasil
    @Override
    public void displayInfo() {
        System.out.println("Informasi Mahasiswa:");
        System.out.println("Nama: " + getNama()); // Menampilkan nama mahasiswa
        System.out.println("NIM: " + getNim()); // Menampilkan NIM mahasiswa
    }
}