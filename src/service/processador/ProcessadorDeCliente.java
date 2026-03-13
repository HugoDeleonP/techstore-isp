package service.processador;

import model.Cliente;
import strategy.GerenciadorDeClientes;

public class ProcessadorDeCliente {

    public void cadastrarCliente(Cliente cliente, GerenciadorDeClientes gerenciadorDeClientes){
        gerenciadorDeClientes.cadastrarCliente(cliente);
    }

    public String buscarClientePorEmail(String email, GerenciadorDeClientes gerenciadorDeClientes){
        return gerenciadorDeClientes.buscarClientePorEmail(email);
    }

}
