package Projeto_Cartao;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Transacoes {
    private Double valor;
    private LocalDateTime agora;
    private String local;
    private String cartao;
    private String usuario;

//    public Transacoes(Double valor, String cartao){
//        this.valor = valor;
//        this.cartao = cartao;
//    }

    public Transacoes(String usuario, String cartao,Double valor, String local ) {
        this.valor = valor;
        this.local = local;
        this.cartao = cartao;
        this.usuario=usuario;
        this.agora=LocalDateTime.now();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        return "Transacoes{" +
                ", cliente ='" + usuario + '\'' +
                ", cartao='" + cartao + '\'' +
                "valor=" + valor +

                ", local='" + local + '\'' +
                ", agora=" + agora +'\''+

                '}';
    }

//    private Integer valor;
//    private String cartao;
    //public Map<String, Integer> transacoes= new HashMap<String, Integer>();

//    public Transacoes(String cartao, Integer valor){
//        this.cartao = cartao;
//        this.valor = valor;
//    }
//    transacoes
//    void valor(){}
//    void data(){}
//    void local(){}
//    void tipocartao(){}
}
