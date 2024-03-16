package EstruturaCondicionalSimples;

public class EstruturaSimples {
    public static void main(String[] args) {
        // exemplo caixa eletrônico

        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }

        System.out.println(saldo);
    }
}
