/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JM
 */
public class Servico {
    private int id;
    private String nome;
    private Especialidade especialidade;
    private float valor;
    private double duracao;
    
    public Servico(String nome, Especialidade especialidade, float valor, double duracao)
    {
    this.nome = nome;
    this.especialidade = especialidade;
    this.valor = valor;
    this.duracao = duracao;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    public Servico() {
        this.id = 0;
        this.nome = "";
        this.valor = 0;
        this.duracao = 0;
        
        
    }
    
}
