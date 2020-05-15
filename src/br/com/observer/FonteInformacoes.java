package br.com.observer;

import java.util.ArrayList;
import java.util.List;

public class FonteInformacoes extends Sujeito {
    private List<InformacoesInternas> listaDeTransmissao = new ArrayList<InformacoesInternas>();

    @Override
    public void anexar(InformacoesInternas informacao) {
        listaDeTransmissao.add(informacao);
    }

    @Override
    public void notificar(String tipo, String titulo, String texto, int dia, int mes) {
        for(InformacoesInternas informacaoInterna : listaDeTransmissao) {
            informacaoInterna.novaInformacao(tipo, titulo, texto, dia, mes);
        }
    }
}
