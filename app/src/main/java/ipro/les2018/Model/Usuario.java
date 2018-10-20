package ipro.les2018.Model;

public class Usuario {
    private String email;
    private String senha;
    private String tipo;
    private String usuario_status;

    public Usuario(){
        this.email = "noemail@nodomain.com";
        this.senha = "noPass";
        this.tipo = "cliente";
        this.usuario_status = "ativo";
    }

    public Usuario(String email, String senha, String tipo, String usuario_ativo) {
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
        this.usuario_status = "ativo";
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuario_status() {
        return usuario_status;
    }

    public void setUsuario_status(String usuario_status) {
        this.usuario_status = usuario_status;
    }


    @Override
    public String toString() {
        return String.format("Email:%s%nTipo%s%n", this.email,this.tipo);
    }


}
