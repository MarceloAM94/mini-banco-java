public class Cliente {
    private int codClient;
    private String name;
    private Cuenta account;

    public Cliente(int codClient, String name, Cuenta account) {
        this.codClient = codClient;
        this.name = name;
        this.account = account;
    }

    public int getCodClient() {
        return codClient;
    }

    public void setCodClient(int codClient) {
        this.codClient = codClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cuenta getAccount() {
        return account;
    }

    public void setAccount(Cuenta account) {
        this.account = account;
    }

    public void depositar(double monto) {
        account.deposit(monto);
    }

    public void retirar(double monto) {
        account.withdraw(monto);
    }

    public void mostrarEstadoCuenta() {
        System.out.println("Cliente: " + name + " (Código: " + codClient + ")");
        System.out.println("Cuenta: " + account); // llama automáticamente al toString() de la subclase
        System.out.println("---------------------------");
    }

    @Override
    public String toString() {
        return "Cliente [Código: " + codClient + ", Nombre: " + name + ", Cuenta: " + account + "]";
    }

}
