package ipro.les2018.Model;

public class Usuario {
    private String email;
    private String senha;

    public Usuario(){
        this.email = "noemail@nodomain.com";
        this.senha = "noPass";
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @Override
    public String toString() {
        return this.email;
    }
}
