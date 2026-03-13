package service.processador;

import strategy.Notificador;

public class ProcessadorDeNotificacao {

    public void enviarNotificacao(String email, String mensagem, Notificador notificador){
           notificador.enviarNotificacao(email, mensagem);
    }

}
