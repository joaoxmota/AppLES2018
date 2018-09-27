package ipro.les2018.Model;

public class Endereco {
    private String rua;
    private String bairro;
    private int numero;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;

    public Endereco(String rua, String bairro, int numero, String cidade, String estado, String pais, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
    }
    public Endereco() {
        this.rua = "";
        this.bairro = "";
        this.numero = 0;
        this.cidade = "";
        this.estado = "";
        this.pais = "";
        this.cep = "";
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return String.format ( "Rua: %s Numero: %d%nBairro: %s CEP: %s",this.rua,this.numero,this.bairro,this.cep );
    }
}
