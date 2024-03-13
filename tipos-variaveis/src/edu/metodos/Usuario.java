package edu.metodos;

public class Usuario {
    public static void main(String[] args) {
        //essa é a forma de criar uma classe para ilustrar a interação dos metodos, atributos e assim sucessivamente.
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " + smartTv.volume);
        
        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.mudarDeCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);


        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
    }
}
