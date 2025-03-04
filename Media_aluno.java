//Obter o nome do aluno e 3 notas
//Exibir a mensagem da média no finasl
//Se a nota for maior ou igual a 7, imprimir Aprovado, se não: Reprovado 
//tentar também fazer se for maior ou igual a 3 imprimir Prova Final

import java.util.Scanner;

public class Media_aluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Digite o nome do aluno: ");

        String nome = scanner.nextLine();

        System.out.println("Digite sua nota na N1: ");

        double n1 = scanner.nextDouble(); 

        System.out.println("Digite sua nota na N2: ");
        
        double n2 = scanner.nextDouble();
        
        System.out.println("Digite sua nota na N3: ");
        double n3 = scanner.nextDouble();

        double media = (n1+n2+n3) / 3;

        System.out.println("A média do aluno: " + nome + " foi = " + media);

    
        if(media >= 7.0){

            System.out.println("Parabéns! Você foi Aprovado.");

        } else if(media >=3 && media <7){
            System.out.println("Você está na Recuperação! Estude!");
        } else{
            System.out.println("Você foi Reprovado.");
        }

        scanner.close();
    }
}
