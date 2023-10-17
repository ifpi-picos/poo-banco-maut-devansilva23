public class ContaPoupanca {
    private String titular;
    private double saldo;

    public ContaPoupanca(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo da conta de " + titular + ": R$" + saldo);
    }

    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca("pamella", 2000.0);

        conta.mostrarSaldo();
        conta.depositar(700.0);
        conta.sacar(100.0);
        conta.mostrarSaldo();
    }
}
