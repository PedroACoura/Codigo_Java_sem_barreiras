package Versao3;

public class Estabelecimento {

    public String razaoSocial;
    public String CNPJ;
    public String estadosUF;
    public String tipoDeEstabelecimento;
    public Integer contador;


    public Estabelecimento(Integer contador, String razaoSocial, String CNPJ, String estadosUF, String tipoDeEstabelecimento) {
        this.contador = contador;
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.estadosUF = estadosUF;
        this.tipoDeEstabelecimento = tipoDeEstabelecimento;

    }

//    @Override
//    public String toString() {
//        return "Teste.Estabelecimento: " + razaoSocial;
//    }


    @Override
    public String toString() {
        return contador +
                "- Nome do estabelicimento -'" + razaoSocial + '\'' +
                ", CNP -'" + CNPJ + '\'' +
                ", estadosUF -'" + estadosUF + '\'';
    }


    public int identificadorDoEstabelecimento() {
        return this.contador;
    }

    public String cnpjDoEstabelecimento() {
        return this.CNPJ;
    }

    public String dadosEsabelicimento() {
        return this.contador +
                "- Nome do estabelicimento -'" + this.razaoSocial + '\'' +
                ", CNP -'" + this.CNPJ + '\'' +
                ", estadosUF -'" + this.estadosUF + '\'';
    }
}
