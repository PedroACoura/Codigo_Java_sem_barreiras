package Versao3;

public class AleloRefeicao extends CartaoDeBeneficiosAlelo implements InterfaceCartaoDeBeneficiosAlelo {

    private final Integer senhaDoCartaoVR = 2345;
    private Double saldoAtualDoCartao = 1000.00;
    private final Integer codigoDoCartaoVR = 234;

    public Boolean senhaDoCartao(Integer senhaDoCartaoVR) {
        return senhaDoCartaoVR.equals(this.senhaDoCartaoVR);
    }

    public Boolean codigoDoCartao(Integer codigoDoCartaoVR) {

        return codigoDoCartaoVR.equals(this.codigoDoCartaoVR);
    }

    @Override
    public void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                       Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma) {
        super.adicionarNovaTransacao(valorASerGastoPeloUsuario, nomeDoBeneficiario, valeSelecionadoPeloUsuario, estabelecimentoUtilizadoPeloPrograma);
    }

    public String nomeDoCartao() {
        return "VR";
    }

    @Override
    public void efetuarTransacao(Double valorASerDebitado) {
        saldoAtualDoCartao += valorASerDebitado;
    }

    public Double saldoAtualDoCartao() {
        return saldoAtualDoCartao;
    }
}