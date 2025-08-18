public class Cuenta {
    private int nroAccount;
    private double balance;

    public Cuenta(int nroAccount, double balance) {
        this.nroAccount = nroAccount;
        this.balance = balance;
    }

    public double Deposit(double valor) {
        balance += valor;
        return balance;
    }

    public double Withdraw(double valor) {
        balance -= valor;
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}
