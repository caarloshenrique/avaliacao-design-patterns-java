package br.com.padraoadapter;

public class TelevisaoSmart {

    private String marca;
    private String modelo;
    private boolean acessoInternet;
    private boolean netflix;

    public TelevisaoSmart() {
    }

    public TelevisaoSmart(String marca, String modelo, boolean acessoInternet, boolean netflix) {
        this.marca = marca;
        this.modelo = modelo;
        this.acessoInternet = acessoInternet;
        this.netflix = netflix;
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

    public boolean isAcessoInternet() {
        return acessoInternet;
    }

    public void setAcessoInternet(boolean acessoInternet) {
        this.acessoInternet = acessoInternet;
    }

    public boolean isNetflix() {
        return netflix;
    }

    public void setNetflix(boolean netflix) {
        this.netflix = netflix;
    }

    public String imprimirDadosTelevisaoSmart() {
        return "----Televisão Smart----\n" + "Marca: " + marca + "\nModelo: " + modelo + "\nAcesso à Internet: " + acessoInternet + "\nAcesso à Netflix: " + netflix;
    }
}
