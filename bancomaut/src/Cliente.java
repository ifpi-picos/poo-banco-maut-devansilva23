public class Cliente {
    private String nome;
    private String cpf;
    private String dataNacimento;

    
    public Cliente(String nome, String cpf, String dataNacimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNacimento = dataNacimento;
    }

    }

    public Cliente(String string, String string2) {
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }



public class Conta {
    private Cliente titular;
    private String numeroConta;
    private double saldo;

    public Conta(Cliente titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public Cliente getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso na conta de " + titular.getNome());
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso na conta de " + titular.getNome());
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo da conta de " + titular.getNome() + " (Conta: " + numeroConta + "): R$" + saldo);
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria", "1234567890");
        Conta conta = new Conta(cliente, "54321", 2000.0);

        conta.mostrarSaldo();
        conta.depositar(500.0);
        conta.sacar(700.0);
        conta.mostrarSaldo();
    }
}
