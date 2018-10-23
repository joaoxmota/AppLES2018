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
    //private Endereco endereco;
    //Falta ajustar o tipo
    private String dataAgendamento;
    //alterar o tipo
    private String status;
    //alterar o tipo
    //private Endereco endereco;
    private String endereco;
    private String observacaoAtend;

    public Agendamento(int id,String dataAgendamento,String status,String endereco, String observacaoAtend ) {
        this.id = id;
        this.dataAgendamento = dataAgendamento;
        this.status = status;
        this.endereco = endereco;
        this.observacaoAtend = observacaoAtend;
    }

 
    public Agendamento() {
        this.id = -1;
        this.dataAgendamento = "";
        this.status= "";
        this.endereco = "";
        this.endereco = "";
        this.observacaoAtend = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getObservacaoAtend() {
        return observacaoAtend;
    }

    public void setObservacaoAtend(String observacaoAtend) {
        this.observacaoAtend = observacaoAtend;
    }



    /*@Override
    public String toString() {
        return String.format ( "Nome: %s%nLogin: %s",getNome (),getLogin () );
    }*/
}


