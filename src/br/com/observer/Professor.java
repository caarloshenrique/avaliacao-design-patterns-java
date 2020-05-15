package br.com.observer;

public class Professor extends InformacoesInternas {

    private String nomeProf;

    public Professor(String nome) {
        this.nomeProf = nome;
    }

    @Override
    public void novaInformacao(String tipo, String titulo, String texto, int dia, int mes) {
        System.out.println(
                "O professor " + nomeProf + " recebeu uma nova informação interna!" 
                +"\nTipo: " + tipo 
                + "\nTtulo: " + titulo 
                + "\nMensagem: " + texto 
                + ".\nData: " + dia + "/" + mes + "\n"
        );
    }
}
