package secao_4;

/*
    > EXERCICIO 1: VERIFICAÇÃO DE CATEGORIA DE PREÇO

    Peça ao usuário para inserior o preço de um produto.
    Se o preço for menor que 50, categorize-o como "Barato".
    Se estiver entre 50 a 100, categorize como "Médio".
    Se estiver acima de 100, categorize como "Caro".
    Exiba a categoria correspondente.

    > EXERCICIO 2: VALIDAÇÃO DE LOGIN

    Peça ao usuário para inserir um nome de usuário e uma senha.
    Verifique se o nome de usuário é "admin" e a senha é "1234".
    Se ambos estiverem corretos, exiba "Acesso Permitido".
    Caso contrário, exiba "Acesso Negado".
    
    > EXERCICIO 3: IDENTIFICAÇÃO DE PARIDADE COM STRINGS

    Peça ao usuário para inserir um número.
    Verifique se o número é par ou ímpar, e exiba a palavra "Par" ou "Ímpar".
    Use uma string para armazenar o resultado e exibi-la.

    > EXERCICIO 4: IDENTIFICAÇÃO DE DIA ÚTIL:

    Peça ao usuário para inserir um número de 1 a 7, representando os dias da semana
    (1 para domingo, 7 para sábado).
    Use um switch para verificar se o dia é um dia útil (segunda a sexta) ou final de semana
    (sábado e domingo).
    Exiba uma mensagem correspondente. 

    > EXERCICIO 5: VERIFICAÇÃO DE INTERVALO COM AND

    Peça ao usuário para inserir um número.
    Verifique se o número está no intervalo de 10 a 20, inclusive. 
    Se estiver, exiba "Dentro de um intervalo". Caso contrário, exiba "Fora do Intervalo".

    > EXERCICIO 6: CLASSIFICAÇÃO DA LETRA

    Peça ao usuário para inserir uma letra.
    Verifique se a letra é uma vogal (a, e, i, o, u) ou consoante.
    Exiba "Vogal" ou "Consoante" de acordo com a entrada.
    Considere tanto letras maiusculas quando minusculas.
 */

import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {

        // > EXERCICIO 1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o preço do produto: ");

        double preco = scanner.nextDouble();
        
        if(preco <= 50){
            System.out.println("Esse produto é barato.");

        } else if(preco > 50 && preco <= 100){
            System.out.println("Esse produto é médio.");
        } else{
            System.out.println("Esse produto é caro.");
        }
        //EXERICIO 1 COMPLETO 

        // >Exercicio 2

       System.out.println("Digite o nome de usuário: ");

       String nome = scanner.next(); 

       System.out.println("Digite a senha de quatro digitos: ");

       String senha = scanner.next();

       if(nome.equalsIgnoreCase("admin") && senha.equals("1234")){
        System.out.println("Acesso permitido.");
       } else{
        System.out.println("Acesso negado.");
       }
       //exercicio 2 concluido

       // > EXERCICIO 3:
       System.out.println("Insira um número: ");

       int num = scanner.nextInt();

       if(num % 2 == 0){
        System.out.println("O " + num + " é Par.");
       } else{
        System.out.println("O " + num + " é Ímpar.");
       }
       //EXERCICIO 3 COMPLETO
       
       // > EXERCICIO 4: 
       System.out.println("Insira um número de 1 a 7 representando os dias da semana: ");

       int semana = scanner.nextInt(); 

       switch(semana){

        case 1:
        case 7: 
            System.out.println("Fim de semana.");
            break;
        case 2:
        case 3:
        case 4:
        case 5: 
        case 6: 
            System.out.println("Dia da semana.");
            break;

        default:
            System.out.println("Insira um número de 1 a 7.");
            break;
       }
       //exercicio 4 concluido

       // > EXERCICIO 5: 

       System.out.println("Insira um número: ");

       double nume = scanner.nextDouble();

       if(nume >= 10 && nume <= 20){
        System.out.println("Está no intervalo.");
       } else{
        System.out.println("Não esta no intervalo.");
       }
       //EXERCICIO 5 COMPLETO

       // > EXERCICIO 6: 

       System.out.println("Insira uma letra: ");

       String letra = scanner.next().toLowerCase();

       switch(letra){
        case "a": 
        case "e": 
        case "i": 
        case "o": 
        case "u": 
            System.out.println("É vogal.");
            break;
        default:
            System.out.println("É consoante.");
            break;


       }
       scanner.close();

    } 
}
