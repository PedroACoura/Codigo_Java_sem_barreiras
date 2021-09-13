package Projeto_Cartao;

public class Estabelecimento {

    private String nomeDoEstabelecimento;
    private Integer identificadorDoEstabelecimento;
    private String localizacaoDoEstabelecimento;
    private String tipoDeEstabelecimento;

    public Estabelecimento(String nomeDoEstabelecimento, Integer identificadorDoEstabelecimento, String localizacaoDoEstabelecimento, String tipoDeEstabelecimento) {
        this.nomeDoEstabelecimento = nomeDoEstabelecimento;
        this.identificadorDoEstabelecimento = identificadorDoEstabelecimento;
        this.localizacaoDoEstabelecimento = localizacaoDoEstabelecimento;
        this.tipoDeEstabelecimento = tipoDeEstabelecimento;
    }

    public String getNomeDoEstabelecimento() {
        return nomeDoEstabelecimento;
    }

    public void setNomeDoEstabelecimento(String nomeDoEstabelecimento) {
        this.nomeDoEstabelecimento = nomeDoEstabelecimento;
    }

    public Integer getIdentificadorDoEstabelecimento() {
        return identificadorDoEstabelecimento;
    }

    public void setIdentificadorDoEstabelecimento(Integer identificadorDoEstabelecimento) {
        this.identificadorDoEstabelecimento = identificadorDoEstabelecimento;
    }

    public String getLocalizacaoDoEstabelecimento() {
        return localizacaoDoEstabelecimento;
    }

    public void setLocalizacaoDoEstabelecimento(String localizacaoDoEstabelecimento) {
        this.localizacaoDoEstabelecimento = localizacaoDoEstabelecimento;
    }

    public String getTipoDeEstabelecimento() {
        return tipoDeEstabelecimento;
    }

    public void setTipoDeEstabelecimento(String tipoDeEstabelecimento) {
        this.tipoDeEstabelecimento = tipoDeEstabelecimento;
    }

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "nome do estabalecimento='" + nomeDoEstabelecimento + '\'' +
                ", número de indentificador =" + identificadorDoEstabelecimento +
                ", localizado em ='" + localizacaoDoEstabelecimento + '\'' +
                ",  no Estabelecimento='" + tipoDeEstabelecimento + '\'' +
                '}';
    }
}
