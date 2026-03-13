package service;

import model.Cliente;
import strategy.GerenciadorDeClientes;

public class ClienteComumService implements GerenciadorDeClientes {

    @Override
    public void cadastrarCliente(Cliente cliente) {
        System.out.println("COMUM: Cadastrando " + cliente.getNome());
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "COMUM: Encontrado cliente com email " + email;
    }
}
