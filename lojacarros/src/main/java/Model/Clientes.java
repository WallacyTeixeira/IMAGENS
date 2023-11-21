package Model;

public class Clientes {
    private String Nome;
    private String Endereço;
    private int NumeroTelefone;
    private int CPF;

    public Clientes(String nome, String endereço, int numeroTelefone, int cPF) {
        Nome = nome;
        Endereço = endereço;
        NumeroTelefone = numeroTelefone;
        CPF = cPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public int getNumeroTelefone() {
        return NumeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        NumeroTelefone = numeroTelefone;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        CPF = cPF;
    }
}
