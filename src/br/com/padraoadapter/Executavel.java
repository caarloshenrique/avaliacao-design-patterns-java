package br.com.padraoadapter;

public class Executavel {

    public static void main(String[] args) {
        TelevisaoSmart tvSmart = new TelevisaoSmart();

        tvSmart.setMarca("Samsung");
        tvSmart.setModelo("QLED-K");
        tvSmart.setAcessoInternet(true);
        tvSmart.setNetflix(true);

        Chromecast adaptador = new Chromecast(tvSmart);
        System.out.println(adaptador.imprimirDadosTelevisaoAntiga());
    }
}
