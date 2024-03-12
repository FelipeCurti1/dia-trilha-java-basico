package edu.operadores;

public class Operadores {

    public static void main(String[] args) {

        //********** Concatenação de String com String **********
        // String nomeCompleto = "Linguagem" + " " + "Java";
        // System.out.println(nomeCompleto);

        //********** Concatenação de número mais String **********
        // String concatenacao = "?";

        // concatenacao = 1 + 1 + 1 + "1";

        // concatenacao = 1 + "1" + 1 + 1;

        // concatenacao = 1 + "1" + 1 + "1";

        // concatenacao = "1" + 1 + 1 + 1;

        // concatenacao = "1" + (1 + 1 + 1);

        //********** Operadores Unários **********
        // int numero = 5;

        // numero = - numero;
        // System.out.println(numero);
        // numero = numero * -1;
        // System.out.println(numero);

        //********** Operadores com repetição **********
        // int numero = 5;

        // numero = numero + 1;

        // System.out.println(numero++);

        // System.out.println(numero);

        //********** Operadores com variaveis booleanas **********

        // boolean variavel = true;

        // variavel = !variavel;

        // System.out.println(variavel);



        //********** Ternário em operadores **********

        // int a, b;

        // a = 6;
        // b = 6;
        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        // if(a==b)
        // resultado = "verdadeiro";
        // else
        // resultado = "falso";

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        // String resultado = (a == b) ? "verdadeiro" : "false";

        // System.out.println(resultado);

        //********** Operadores Relacionais **********

        // int numero1 = 1;
        // int numero2 = 2;

        // if (numero1 > numero2)
        //     System.out.print("Numero 1 maior que numero 2");

        // boolean simNao = numero1 == numero2;

        // System.out.println("numeroUm é igual a numeroDois? " + simNao);

        // simNao = numero1 != numero2;

        // System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        // simNao = numero1 > numero2;

        // System.out.println("numeroUm é maior a numeroDois? " + simNao);

        // simNao = numero1 < numero2;

        // System.out.println("numeroUm é menor a numeroDois? " + simNao);


        //********** Exemplo com String, com objetos utilizar o .equals **********

        // String nomeUm = "FELIPE";
        // String nomeDois = new String("FELIPE");

        // System.out.println(nomeUm.equals(nomeDois));


        //**********  Operadores Lógicos **********

        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras.");
        }
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira.");
        }
        System.out.println("Fim");

    }
}
