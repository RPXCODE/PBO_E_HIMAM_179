package perpustakaan;

public class Nonfiksi extends Buku {
    public Nonfiksi(int id, String judul, String penulis) {
        super(id, judul, penulis);
    }

    @Override
    public void displayInfo() {
        System.out.println("[Non-Fiksi] ID: " + id + " | " + judul + " oleh " + penulis);
    }
}