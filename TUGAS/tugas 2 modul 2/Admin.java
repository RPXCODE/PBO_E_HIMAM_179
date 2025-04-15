import javax.xml.namespace.QName;

public class Admin {
    String Username;
    String Password;

    void Login(){ //method untuk menyimpan info login user
        if (Username.equals("Admin179")&& Password.equals("Password179")){ //data login user untuk mengecek benar dan salahnya login admin
            System.out.println("Login Admin berhasil !"); //output jika login admin benar
        }else{
            System.out.println("Login Gagal ! Username atau Password salah.");//output jika login admin salah
        }
    }
}