public class Estabelecimento {

    public String razaoSocial;
    public Integer CNPJ;
    public String estadosUF;
    public String tipoDeEstabelecimento;


    public Estabelecimento(String razaoSocial, Integer CNPJ, String estadosUF, String tipoDeEstabelecimento) {
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.estadosUF = estadosUF;
        this.tipoDeEstabelecimento = tipoDeEstabelecimento;
    }

    @Override
    public String toString() {
        return "Estabelecimento: " + razaoSocial;
    }

    public Integer identificadorDoEstabelecimento() {
        return this.CNPJ;
    }
}
