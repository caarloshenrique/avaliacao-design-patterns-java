package br.com.observer;

public class Aluno extends InformacoesInternas {

    private String nomeAluno;

    public Aluno(String nome) {
        this.nomeAluno = nome;
    }

    @Override
    public void novaInformacao(String tipo, String titulo, String texto, int dia, int mes) {
        System.out.println(
                "O aluno " + nomeAluno + " recebeu uma nova informação interna!"
                +"\nTipo: " + tipo 
                + "\nTítulo: " + titulo 
                + "\nMensagem: " + texto 
                + ".\nData: " + dia + "/" + mes + "\n");
    }
}
