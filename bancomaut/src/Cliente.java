
public class Cliente {
    private String nome;
    private String cpf;
    private String dataNacimento;
   
    
    public Cliente(String nome, String cpf, String dataNacimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNacimento = dataNacimento;
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



}