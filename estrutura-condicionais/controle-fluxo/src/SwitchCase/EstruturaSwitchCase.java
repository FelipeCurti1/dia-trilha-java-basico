package SwitchCase;

public class EstruturaSwitchCase {
    public static void main(String[] args) {
        // EXEMPLO SISTEMA DE MEDIDA USANDO IF ELSE:

        // String sigla = "M";

		// if(sigla == "P")
		// 	System.out.println("PEQUENO");
		// else if(sigla == "M")
		// 	System.out.println("MÉDIO");
		// else if(sigla == "G")
		// 	System.out.println("GRANDE");
		// else
		// 	System.out.println("INDEFINIDO");


        // EXEMPLO SISTEMA DE MEDIDA USANDO SWITCH CASE:
        
        String sigla = "G";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
    }
}
