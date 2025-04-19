class Mahasiswa extends User {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void login() {
        if (getNama().equalsIgnoreCase("iqodhul himam") && getNim().equals("202410370110179")) {
            System.out.println("Login Mahasiswa berhasil!");
            System.out.println();
            displayInfo();
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Informasi Mahasiswa:");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}
