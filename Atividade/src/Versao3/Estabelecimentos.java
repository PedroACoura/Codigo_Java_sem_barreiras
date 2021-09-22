package Versao3;

import java.util.ArrayList;
import java.util.List;

public class Estabelecimentos {
    static List<Estabelecimento> estabelecimentos = new ArrayList<>();

    public void criarEstabelecimentosDisponiveisParaGastar() {
        estabelecimentos.add(new Estabelecimento(1,"Supermercado Carrefour", "85.483.044/0001-72", "São Paulo", "MERCADO"));
        estabelecimentos.add(new Estabelecimento(2,"Restaurante Fogo de Chão","75.629.854/0001-30" , "Espirito Santos", "RESTOURANTE"));
        estabelecimentos.add(new Estabelecimento(3,"Posto Shell", "40.481.351/0001-86", "Bahia", "POSTO_COMBUSTIVEL"));
        estabelecimentos.add(new Estabelecimento(4,"Farmácia Drogasil", "62.615.840/0001-16", "Recife", "FARMACIA"));

    }
}



/*

estabelecimentos.add(new Estabelecimento("Supermercado Carrefour", 1, "São Paulo", "MERCADO"));
        estabelecimentos.add(new Estabelecimento("Restaurante Fogo de Chão",2 , "Espirito Santos", "RESTOURANTE"));
        estabelecimentos.add(new Estabelecimento("Posto Shell", 3, "Bahia", "POSTO_COMBUSTIVEL"));
        estabelecimentos.add(new Estabelecimento("Farmácia Drogasil", 4, "Recife", "FARMACIA"));

     estabelecimentos.add(new Estabelecimento("Supermercado Carrefour", "85.483.044/0001-72", "São Paulo", "MERCADO"));
        estabelecimentos.add(new Estabelecimento("Restaurante Fogo de Chão","75.629.854/0001-30" , "Espirito Santos", "RESTOURANTE"));
        estabelecimentos.add(new Estabelecimento("Posto Shell", "40.481.351/0001-86", "Bahia", "POSTO_COMBUSTIVEL"));
        estabelecimentos.add(new Estabelecimento("Farmácia Drogasil", "62.615.840/0001-16", "Recife", "FARMACIA"));
https://www.4devs.com.br/gerador_de_cnpj
 */