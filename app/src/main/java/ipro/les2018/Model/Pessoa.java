/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author JM
 */
/*public class Pessoa {
    
}*/
//package ipro.les2018.Model;

public class Pessoa  {
    int id;
    String login;
    String senha;
    String tipo;
    String status;
    String nome;
    //private Endereco endereco;
    String telefone;
    String celular;
    String foto;
    //alterar
    String dataNascimento;
    String Identidade;
    //Alterar
    String Especialidade;
    String avaliacao;

    public Pessoa(String login, String senha, String tipo, String nome, String telefone, String celular, String foto, String dataNascimento,String Identidade,String Especialidade,String avaliacao) {
        
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.foto = foto;
        this.dataNascimento = dataNascimento;
        this.Identidade = Identidade;
        this.Especialidade = Especialidade;
        this.avaliacao = avaliacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

   

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdentidade() {
        return Identidade;
    }

    public void setIdentidade(String Identidade) {
        this.Identidade = Identidade;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

    public String getavaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
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

    /*@Override
    public String toString() {
        return String.format ( "Nome: %s%nLogin: %s",getNome (),getLogin () );
    }*/
}


