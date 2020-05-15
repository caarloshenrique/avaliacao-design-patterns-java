package br.com.proxyfacade;

public class LojaVirtualImpl implements LojaVirtual {

    public LojaVirtualImpl() {
    }

    @Override
    public void comprar() {
        System.out.println("----Você acionou a operação de compra----");
    }

    @Override
    public void vender() {
        System.out.println("----Você acionou a operação de venda----");
    }

    @Override
    public void visualizarLucro() {
        System.out.println("----Você acionou a operação de visualização de lucro----");
    }
}
