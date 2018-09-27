package ipro.les2018.Model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PessoaFisica extends Pessoa {
    private Calendar dataNascimento;
    private String cpf;

    public PessoaFisica(String email, String senha, String nome, Endereco endereco, String telefone, String celular, String foto, Calendar dataNascimento, String cpf) {
        super ( email, senha, nome, endereco, telefone, celular, foto );
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, Endereco endereco, String telefone, String celular, String foto, Calendar dataNascimento, String cpf) {
        super ( nome, endereco, telefone, celular, foto );
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public PessoaFisica(Calendar dataNascimento, String cpf) {
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public PessoaFisica() {
        this.dataNascimento = new  GregorianCalendar(2000,01,01);
        this.cpf = "";
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
