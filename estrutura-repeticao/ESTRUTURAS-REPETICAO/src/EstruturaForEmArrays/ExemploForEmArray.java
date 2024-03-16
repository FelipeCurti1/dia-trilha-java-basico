package EstruturaForEmArrays;

public class ExemploForEmArray {
    public static void main(String[] args) {
        
        //em arrays o indici inicia em 0;
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}
