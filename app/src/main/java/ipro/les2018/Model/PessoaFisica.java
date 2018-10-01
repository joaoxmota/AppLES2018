package ipro.les2018.Model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PessoaFisica extends Pessoa {
    private Calendar dataNascimento;
    private String cpf;

    /**
     * Inicia PessoaFisica, Pessoa e o Usuario com valores extritos
     * @param email
     * @param senha
     * @param tipo
     * @param nome
     * @param endereco
     * @param telefone
     * @param celular
     * @param foto
     * @param dataNascimento
     * @param cpf
     */
    public PessoaFisica(String email, String senha, String nome, Endereco endereco, String telefone, String celular, String foto, Calendar dataNascimento, String cpf,String tipo) {
        super ( email, senha, nome, endereco, telefone, celular, foto ,tipo);
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    /**
     * Inicializa PessoaFisica e Pessoa com valores extritos, Usuario é inicializado com o construtor padrão (VAZIOS)
     * @param nome
     * @param endereco
     * @param telefone
     * @param celular
     * @param foto
     * @param dataNascimento
     * @param cpf
     */
    public PessoaFisica(String nome, Endereco endereco, String telefone, String celular, String foto, Calendar dataNascimento, String cpf) {
        super ( nome, endereco, telefone, celular, foto );
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    /**
     *Inicializa PessoaFisica com valores extritos, Pessoa e usuario são inicializados com seus construtores padrões (VAZIO)
     * @param dataNascimento
     * @param cpf
     */
    public PessoaFisica(Calendar dataNascimento, String cpf) {
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    /**
     *  Inicializa PessoaFisica, Pessoa e Usuario com seus construtores Padrões (VAZIOS)
     */
    public PessoaFisica() {
        this.dataNascimento = new  GregorianCalendar(2000,01,01);
        this.cpf = "";
    }

    /**
     * Retorna a data de nascimento da instancia de pessoa fisica
     * @return dataNascimento
     */
    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Recebe um valor do tipo Calendar e atribui este valor a data de nascimento a uma instancia de pessoa fisica
     * @param dataNascimento
     */
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * Retorna o cpf da instancia de pessoa fisica
     * @return cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Recebe um valor do Tipo String e atribui este valor ao cpf de uma instancia de pessoa fisica
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
