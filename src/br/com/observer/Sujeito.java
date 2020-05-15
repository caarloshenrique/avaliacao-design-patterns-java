package br.com.observer;

public abstract class Sujeito {

    abstract void anexar(InformacoesInternas informacao);

    abstract void notificar(String tipo, String titulo, String texto, int dia, int mes);
}
