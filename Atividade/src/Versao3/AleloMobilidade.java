package Versao3;

public class AleloMobilidade extends CartaoDeBeneficiosAlelo implements InterfaceCartaoDeBeneficiosAlelo {

    private final Integer senhaDoCartaoVC = 3456;
    private Double saldoAtualDoCartao = 1000.00;
    private final Integer codigoDoCartaoVC = 345;

    @Override
    public void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                       Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma) {
        super.adicionarNovaTransacao(valorASerGastoPeloUsuario, nomeDoBeneficiario, valeSelecionadoPeloUsuario, estabelecimentoUtilizadoPeloPrograma);
    }

    public Boolean senhaDoCartao(Integer senhaDoCartaoVC) {
        return senhaDoCartaoVC.equals(this.senhaDoCartaoVC);
    }
    public Boolean codigoDoCartao(Integer codigoDoCartaoVC) {

        return codigoDoCartaoVC.equals(this.codigoDoCartaoVC);
    }


    public String nomeDoCartao() {
        return "VC";
    }

    @Override
    public void efetuarTransacao(Double valorASerDebitado) {
        saldoAtualDoCartao += valorASerDebitado;
    }

    public Double saldoAtualDoCartao() {
        return saldoAtualDoCartao;
    }
}
