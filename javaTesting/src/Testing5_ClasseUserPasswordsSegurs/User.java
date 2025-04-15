package Testing5_ClasseUserPasswordsSegurs;

public class User {

    private String nom;
    private String password;  // password in hash mode and salted
    private String salt; // van canviant a cada usuari
    // password == Hash( password_real + salt )

    public User() {
        this("Toni", "secret");
    }

    public User(String nom, String password) {
        this.nom = nom;
        this.password = password; // insegura !!!
        this.salt = PasswordUtils.genSalt();
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
