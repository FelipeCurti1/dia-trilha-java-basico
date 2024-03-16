package EstruturaForEmArrays;

public class ExemploForEach {
    public static void main(String[] args) {
        
        //em arrays o indici inicia em 0;
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for(String aluno: alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
