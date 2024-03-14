import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        
        //os argumentos começam com indice 0**** EXEMPLO USANDO OS args presentes dentro do arquivo launch.json
        // String nome = args [0];
        // String sobrenome = args [1];
        // int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        // double altura = Double.valueOf(args[3]);

        // System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        // System.out.println("Tenho " + idade + " anos ");
        // System.out.println("Minha altura é " + altura + "cm ");


        //*** EXEMPLO USANDO O SCANNER E O LOCALE

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: " + altura + " Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade);

    }
}