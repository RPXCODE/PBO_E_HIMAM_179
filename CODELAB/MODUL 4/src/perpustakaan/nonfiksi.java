package perpustakaan;

public class Nonfiksi extends Buku {
    public Nonfiksi(int id, String judul, String penulis) {
        super(id, judul, penulis);
    }

    @Override
    public void displayInfo() {
        System.out.println("\uD83D\uDCD7 [Non-Fiksi] ID: " + id + " | " + judul + " oleh " + penulis);
    }
}