package br.com.observer;

public class Executavel {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Carlos Henrique");
        Professor professor1 = new Professor("Afranio Furtado");
        FonteInformacoes fonteInformacao = new FonteInformacoes();

        fonteInformacao.anexar(aluno1);
        fonteInformacao.anexar(professor1);

        fonteInformacao.notificar("Informação de Ensino", "Fique em casa!", "Respeite as medidas de distanciamento social recomendadas pela OMS", 14, 05);
    }
}
