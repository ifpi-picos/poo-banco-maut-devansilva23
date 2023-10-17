import java.util.Date;

public class Transacoes {
    private String tipo;
    private double valor;
    private Date data;
    private String descricao;

    public Transacoes(String tipo, double valor, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = new Date();
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    }

