
class Admin extends User {
    private String password;
    private String username;

    public Admin(String username, String password) {

        super("iqodhul himam", "202410370110179");
        this.username = username;
        this.password = password;
    }


    @Override
    public void login() {

        if (username.equals("admin179") && password.equals("password179")) {
            System.out.println("Login Admin berhasil!");
            System.out.println();
            displayInfo();
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Informasi Admin:");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
        System.out.println("Username: " + username);
    }
}