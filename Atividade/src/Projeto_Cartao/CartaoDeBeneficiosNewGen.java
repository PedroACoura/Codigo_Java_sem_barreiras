package Projeto_Cartao;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class CartaoDeBeneficiosNewGen {
    public int saldo=1000;
    public LocalDateTime validade;
    public String usuario;
    public int senha;

    public Integer getSaldo() {
        return saldo;
    }

    public LocalDateTime getValidade() {
        return validade;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getSenha() {
        return senha;
    }

    public Map<String, Integer> transacoes= new HashMap<String, Integer>();

    public void antifraude() {

    }

    public void estrato() {

    }

}