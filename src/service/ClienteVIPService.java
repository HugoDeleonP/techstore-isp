package service;

import model.Cliente;
import strategy.Desconto;
import strategy.GerenciadorDeClientes;
import strategy.Notificador;

public class ClienteVIPService implements GerenciadorDeClientes, Desconto, Notificador {

    @Override
    public void cadastrarCliente(Cliente cliente) {
        System.out.println("VIP: Cadastrando " + cliente.getNome());
    }
    @Override
    public String buscarClientePorEmail(String email) {
        return "VIP: Encontrado cliente com email " + email;
    }
    @Override
    public void enviarNotificacao(String email, String mensagem) {
        System.out.println("VIP: Enviando notificação para " + email);
    }
    @Override
    public void aplicarDesconto(String email, double percentual) {
        System.out.println("VIP: Aplicando " + percentual + "% de desconto para "
                + email);
    }

}
