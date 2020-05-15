package br.com.padraoadapter;

public class Chromecast extends TelevisaoAntiga {

    TelevisaoSmart televisaoSmart;

    public Chromecast(TelevisaoSmart televisaoSmart) {
        this.televisaoSmart = televisaoSmart;
    }

    @Override
    public String imprimirDadosTelevisaoAntiga() {
        return this.televisaoSmart.imprimirDadosTelevisaoSmart();
    }
}
