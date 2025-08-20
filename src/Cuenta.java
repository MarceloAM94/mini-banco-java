public abstract class Cuenta {
    private int nroAccount;
    private double balance;

    public Cuenta(int nroAccount, double balance) {
        this.nroAccount = nroAccount;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNroAccount() {
        return nroAccount;
    }

    public double deposit(double valor) {
        balance += valor;
        return balance;
    }

    public abstract double withdraw(double valor);
}

