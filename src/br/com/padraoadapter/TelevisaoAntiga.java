package br.com.padraoadapter;

public class TelevisaoAntiga {

    private String marca;
    private String modelo;
    private boolean conexaoCoaxial;

    public TelevisaoAntiga() {
    }

    public TelevisaoAntiga(String marca, String modelo, boolean conexaoCoaxial) {
        this.marca = marca;
        this.modelo = modelo;
        this.conexaoCoaxial = conexaoCoaxial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isConexaoCoaxial() {
        return conexaoCoaxial;
    }

    public void setConexaoCoaxial(boolean conexaoCoaxial) {
        this.conexaoCoaxial = conexaoCoaxial;
    }

    public String imprimirDadosTelevisaoAntiga() {
        return "----Televisao Antiga----\n" + "Marca: " + marca + "\nModelo: " + modelo + "\nConexão Coaxial: " + conexaoCoaxial;
    }
}
