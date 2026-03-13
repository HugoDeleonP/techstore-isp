import model.Cliente;
import service.ClienteComumService;
import service.ClienteVIPService;
import service.processador.ProcessadorDeCliente;

public class Main {

    public static void main(String[] args) {

        ProcessadorDeCliente processadorDeCliente = new ProcessadorDeCliente();

        Cliente clienteComum = new Cliente("João", "joao@teste.com");
        processadorDeCliente.cadastrarCliente(clienteComum, new ClienteComumService());

        Cliente clienteVip = new Cliente("Macabeia", "macabeia123@teste.com");
        processadorDeCliente.cadastrarCliente(clienteVip, new ClienteVIPService());


    }
}
