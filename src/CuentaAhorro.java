public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(int nroAccount, double balance) {
        super(nroAccount, balance);
    }

    @Override
    public double withdraw(double valor) {
        if (getBalance() - valor >= 50){
            setBalance(getBalance() - valor);
            return getBalance();
        }else {
            System.out.println("El retiro no se puede realizar, debe dejar un monto minimo de 50");
            return getBalance();
        }
    }

    @Override
    public String toString() {
        return "CuentaAhorro [Número: " + getNroAccount() + ", Saldo: " + getBalance() + "]";
    }

}
