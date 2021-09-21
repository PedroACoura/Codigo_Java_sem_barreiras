package Versao3;

public class AleloMultibenficio extends CartaoDeBeneficiosAlelo implements InterfaceCartaoDeBeneficiosAlelo {


    private final Integer senhaDoCartaoVM = 4567;
    private Double saldoAtualDoCartao = 1000.00;
    private final Integer codigoDoCartaoVM = 456;

    @Override
    public void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                       Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma) {
        super.adicionarNovaTransacao(valorASerGastoPeloUsuario, nomeDoBeneficiario, valeSelecionadoPeloUsuario, estabelecimentoUtilizadoPeloPrograma);
    }

    public Boolean senhaDoCartao(Integer senhaDoCartaoVM) {
        return senhaDoCartaoVM.equals(this.senhaDoCartaoVM);
    }

    public Boolean codigoDoCartao(Integer codigoDoCartaoVM) {

        return codigoDoCartaoVM.equals(this.codigoDoCartaoVM);
    }

    public String nomeDoCartao() {
        return "VM";
    }

    @Override
    public void efetuarTransacao(Double valorASerDebitado) {
        saldoAtualDoCartao += valorASerDebitado;
    }


    public Double saldoAtualDoCartao() {
        return saldoAtualDoCartao;
    }


}


