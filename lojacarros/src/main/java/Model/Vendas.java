package Model;

public class Vendas {
    private int Data;
    private String Modelo;
    private String Cliente;
    private boolean Valor;

    public Vendas(int data, String modelo, String cliente, boolean valor) {
        Data = data;
        Modelo = modelo;
        Cliente = cliente;
        Valor = valor;
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public boolean getValor() {
        return Valor;
    }

    public void setValor(boolean valor) {
        Valor = valor;
    }
}
