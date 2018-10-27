package ipro.les2018.Model;

public class Usuario {
    private String login;
    private String senha;
    private String tipo;
    private String usuario_status;

    public Usuario(){
        this.login = "nologin";
        this.senha = "noPass";
        this.tipo = "cliente";
        this.usuario_status = "ativo";
    }

    public Usuario(String login, String senha, String tipo, String usuario_ativo) {
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
        this.usuario_status = "ativo";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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



}
