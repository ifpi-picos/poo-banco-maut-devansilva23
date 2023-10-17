public class Conta {
    private int numeroAgencia;
    private int numeroConta;
    private double saldo;

    public Conta(int numeroAgencia, int numeroConta, double saldo) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
