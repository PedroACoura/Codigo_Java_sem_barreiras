public class AleloRefeicao extends CartaoDeBeneficiosAlelo implements InterfaceCartaoDeBeneficiosAlelo {

    private final Integer senhaDoCartaoVR = 1234;
    private Double saldoAtualDoCartao = 1000.00;

    public Boolean senhaDoCartao(Integer senhaDoCartaoVR) {
        return senhaDoCartaoVR.equals(this.senhaDoCartaoVR);
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