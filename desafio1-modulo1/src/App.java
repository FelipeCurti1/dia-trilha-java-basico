import java.util.Scanner;

public class App {

    /*
     * Desafio
     * Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o
     * produto entre estes dois valores. Atribua esta operação à variável PROD,
     * mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).
     * 
     * Entrada
     * A entrada contém 2 valores inteiros.
     * 
     * Saída
     * Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um
     * espaço em branco antes e depois da igualdade.
     */

    /*
     * Exemplos de Entrada
     * 3
     * 9
     * 
     * -30
     * 10
     * 
     * 0
     * 9
     * 
     * Exemplos de Saída
     * 
     * PROD = -300
     * PROD = 27
     * PROD = 0
     */

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
		PROD = A * B;

		System.out.println("PROD = " +   PROD  );
    }
}
