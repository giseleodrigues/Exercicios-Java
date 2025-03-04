package secao_2;

public class Exercicios {

    /*
        EXERCICIO 1: 

        Crie uma variável int para orgalizar o valor 10.
        Crie uma segunda variável int que armazene o dobro do valor da primeira variável 
        usando operadores aritméticos.
        Exiba o resultado.
     */
    public static void main(String[] args) {
        

        int valor = 10; 

        int valor2 = valor * 2; 

        System.out.println(valor2);
    
        //EXERCICIO FEITO COM SUCESSOOOOOOO!!!
    

    /*
        EXERCICIO 2: 
        Declare uma variável char que armazene a letra 'B'.
        Faça o casting explicito dessa variável para int e exiba o valor numerico correspondente 
     */
        char letra = 'B';

        int letraInt = (int) letra;

        System.out.println(letraInt);

        //EXERCICIO FEITO COM SUCESSO!!


    /*
        EXERCICIO 3: 
        Declare duas variáveis double para armazenar os valores 15.75 e 20.40.
        Some os valores dessas variáveis e armazene o resultado em uma nova variável double.
        Exiba o resultado 
     */
        double valorUm = 15.75;

        double valorDois = 20.40;

        double soma = valorUm + valorDois;

        System.out.println(soma);

        //EXERCICIO FEITO COM SUCESSO!


    /*  
        EXERCICIO 4: 
        Declare uma variável long para armazenar o número 2 bilhões
        (2_000_000_000). 
        Em seguida, declare uma variável int e faça o casting explicito do valor long para int
        Exiba o resultado.
     */    
        long num = 2_000_000_000L;

        int valorNum = (int) num;

        System.out.println(valorNum);
        
        //EXERCICIO FEITO COM SUCESSO!!

        /*
            EXERCICIO 5: 
            Escreva um programa que crie uma variável String com o valor "Olá, Mundo!".
            Em seguida, crie outra variável String que concatene a primeira variável com o texto 
            "Bem-vindo ao Java!".
            Exiba o resultado 
         */
        String f = "Olá, Mundo!"; 
        String g = "Bem-vindo ao Java!";

        String full = f + " " + g; 

        System.out.println(full);
    }
}
