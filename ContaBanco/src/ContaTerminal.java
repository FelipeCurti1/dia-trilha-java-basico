import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in).useLocale(Locale.US);

        String agencia = "";
        String nomeCliente = "";
        int numero = 0;
        Double saldo = 0.00; 
        
        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o seu Nome!");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da sua Conta!");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o seu Saldo!");
        saldo = sc.nextDouble();


        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +  " já está disponível para saque.", nomeCliente , agencia , numero , saldo );

        sc.close();
    }
}
