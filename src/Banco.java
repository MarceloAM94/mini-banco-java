import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }

    public void addClient(Cliente cliente) {
        clientes.add(cliente); //Agrega cliente
    }

    public void listClients() {
        for (Cliente c : clientes) {
            System.out.println(c); // usa el toString() de Cliente
        }
    }

    public Cliente searchClient(int codClient) {
        for (Cliente c : clientes) {
            if (c.getCodClient() == codClient) {
                return c;
            }
        }
        return null; // si no encuentra
    }
}
