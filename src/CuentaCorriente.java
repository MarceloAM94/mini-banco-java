public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int nroAccount, double balance) {
        super(nroAccount, balance);
    }
    @Override
    public double withdraw(double valor) {
        if (getBalance() - valor <= -500) {
            System.out.println("El retiro no puede dejar un saldo menor de -500");
            return getBalance();
        } else {
            setBalance(getBalance() - valor);
            return getBalance();
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente [Número: " + getNroAccount() + ", Saldo: " + getBalance() + "]";
    }
}
