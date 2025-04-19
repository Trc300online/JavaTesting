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
        // this.password = password; // insegura !!!
        this.salt = PasswordUtils.genSalt();
        //falta fer hash amb salt del password !!
        this.password = PasswordUtils.hashedPassword(password, this.salt);
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean verifyPassword(String passwordEntered) {
        return PasswordUtils.verifyUserPassword(passwordEntered, salt, password);
    }

    public void setPassword(String password) {
        this.password = PasswordUtils.hashedPassword(password, salt);
    }

}
