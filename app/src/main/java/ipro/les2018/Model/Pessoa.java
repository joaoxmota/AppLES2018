package ipro.les2018.Model;

public class Pessoa extends Usuario {

    private String nome;
    private String telefone;
    private String celular;
    private String foto;

    public Pessoa(String email, String senha, String tipo, String nome, Endereco endereco, String telefone, String celular, String foto, String status_usuario) {
        super ( email, senha,tipo, status_usuario);
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.foto = foto;
    }

    public Pessoa(String nome, Endereco endereco, String telefone, String celular, String foto) {
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.foto = foto;
    }
    public Pessoa() {
        this.nome = "";
        this.telefone = "";
        this.celular = "";
        this.foto = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return String.format ( "Nome: %s%nEmail: %s",getNome (), getLogin () );
    }
}
