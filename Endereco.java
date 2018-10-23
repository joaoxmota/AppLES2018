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

public class Endereco  {
    private int id;
    private String rua;
    private String bairro;
    private int numero;
    private String cidade;
    private String estado;
    private String pais;

    /**
     *
    
     */
    public Endereco(int id,String rua, String bairro, int numero, String cidade, String estado, String pais) {
        //super ( login, senha,tipo, status_usuario);
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        
    }

   
    public Endereco() {
        this.id = -1;
        this.rua = "";
        this.bairro = "";
        this.numero = -1;
        this.cidade = "";
        this.estado = "";
        this.pais = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
    /*@Override
    public String toString() {
        return String.format ( "Nome: %s%nLogin: %s",getNome (),getLogin () );
    }*/
}


