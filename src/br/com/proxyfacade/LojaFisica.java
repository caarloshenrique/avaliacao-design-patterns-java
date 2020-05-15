package br.com.proxyfacade;

public class LojaFisica implements LojaVirtual {

    private LojaVirtual lojaVirtual;

    @Override
    public void comprar() {
        if (lojaVirtual == null) {
            lojaVirtual = new LojaVirtualImpl();
        }
        lojaVirtual.comprar();
    }

    @Override
    public void vender() {
        if (lojaVirtual == null) {
            lojaVirtual = new LojaVirtualImpl();
        }
        lojaVirtual.vender();
    }

    @Override
    public void visualizarLucro() {
        if (lojaVirtual == null) {
            lojaVirtual = new LojaVirtualImpl();
        }
        lojaVirtual.visualizarLucro();
    }

    public void acessarLoja() {
        System.out.println("----Você acionou a operação de acesso à loja----");
        if (lojaVirtual == null) {
            lojaVirtual = new LojaVirtualImpl();
        }
        this.lojaVirtual.comprar();
        this.lojaVirtual.vender();
        this.lojaVirtual.visualizarLucro();
    }
}
