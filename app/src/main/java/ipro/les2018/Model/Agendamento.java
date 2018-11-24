
import java.util.GregorianCalendar;

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

public class Agendamento {
    
    private int id;
    private Pessoa cliente;
    private Pessoa profissional;
    private Servico servico;
    private Endereco endereco;
    private StatusAgendamento status;
    private GregorianCalendar dataAgendada ;
    private GregorianCalendar dataAgendamento ;
    private String obeservacao;

    public Agendamento(int id,Pessoa cliente, Pessoa profissional, Servico servico, Endereco endereco, StatusAgendamento status, GregorianCalendar dataAgendada,GregorianCalendar dataAgendamento, String observacao ) {
        this.id = id;
        this.cliente = cliente;
        this.profissional = profissional;
        this.servico = servico;
        this.endereco = endereco;
        this.dataAgendada = dataAgendada;
        this.dataAgendamento = dataAgendamento;
        this.obeservacao = observacao;
    }

 
    public Agendamento() {
        this.id = 0;
        this.cliente = new Pessoa();
        this.profissional = new Pessoa();
        this.servico = new Servico();
        this.endereco = new Endereco();
        this.dataAgendada = new GregorianCalendar();
        this.dataAgendamento = new GregorianCalendar();
        this.obeservacao = "";
    }

 




    /*@Override
    public String toString() {
        return String.format ( "Nome: %s%nLogin: %s",getNome (),getLogin () );
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getProfissional() {
        return profissional;
    }

    public void setProfissional(Pessoa profissional) {
        this.profissional = profissional;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public StatusAgendamento getStatus() {
        return status;
    }

    public void setStatus(StatusAgendamento status) {
        this.status = status;
    }

    public GregorianCalendar getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(GregorianCalendar dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    public GregorianCalendar getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(GregorianCalendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getObeservacao() {
        return obeservacao;
    }

    public void setObeservacao(String obeservacao) {
        this.obeservacao = obeservacao;
    }
}


