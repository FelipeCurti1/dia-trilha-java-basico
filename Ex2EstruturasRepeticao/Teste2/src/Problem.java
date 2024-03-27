import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];
        
        for(int i = 0; i < 10; i++) {
            String input = sc.nextLine();
            if (input.length() > 30) {
                input = input.substring(0, 30);
            }
            nomes[i] = input;
        }

        // Imprime o terceiro, o sétimo e o nono item do array
        System.out.println(nomes[2]);  // Terceiro item
        System.out.println(nomes[6]);  // Sétimo item
        System.out.println(nomes[8]);  // Nono item

        sc.close();
    }
}