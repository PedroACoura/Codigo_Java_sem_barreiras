package Versao3;

public class Estabelecimento {

    public String razaoSocial;
    public int CNPJ;
    public String estadosUF;
    public String tipoDeEstabelecimento;


    public Estabelecimento(String razaoSocial, int CNPJ, String estadosUF, String tipoDeEstabelecimento) {
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.estadosUF = estadosUF;
        this.tipoDeEstabelecimento = tipoDeEstabelecimento;
    }

    @Override
    public String toString() {
        return "Teste.Estabelecimento: " + razaoSocial;
    }

    public int identificadorDoEstabelecimento() {
        return this.CNPJ;
    }
}
