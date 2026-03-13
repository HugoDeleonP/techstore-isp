package strategy;

import model.Cliente;

public interface GerenciadorDeClientes {

    void cadastrarCliente(Cliente cliente);
    String buscarClientePorEmail(String email);
}
