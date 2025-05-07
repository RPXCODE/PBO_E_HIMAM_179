package perpustakaan;

public class Fiksi extends Buku {
    public Fiksi(int id, String judul, String penulis) {
        super(id, judul, penulis);
    }

    @Override
    public void displayInfo() {
        System.out.println(" [Fiksi] ID: " + id + " | " + judul + " oleh " + penulis);
    }
}