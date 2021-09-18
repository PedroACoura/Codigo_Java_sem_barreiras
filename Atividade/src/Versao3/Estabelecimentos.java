package Versao3;

import java.util.ArrayList;
import java.util.List;

public class Estabelecimentos {
    static List<Estabelecimento> estabelecimentos = new ArrayList<>();

    public void criarEstabelecimentosDisponiveisParaGastar() {
        estabelecimentos.add(new Estabelecimento("Supermercado Carrefour", 1, "São Paulo", "MERCADO"));
        estabelecimentos.add(new Estabelecimento("Farmácia Drogasil", 2, "Recife", "FARMACIA"));
        estabelecimentos.add(new Estabelecimento("Posto Shell", 3, "Bahia", "POSTO_COMBUSTIVEL"));
        estabelecimentos.add(new Estabelecimento("Restaurante Fogo de Chão", 4, "Espirito Santos", "RESTOURANTE"));

    }
}
