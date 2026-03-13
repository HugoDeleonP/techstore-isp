package service.processador;

import strategy.Desconto;

public class ProcessadorDeDesconto {

    void aplicarDesconto(String email, double percentual, Desconto desconto){
        desconto.aplicarDesconto(email, percentual);
    };
}
