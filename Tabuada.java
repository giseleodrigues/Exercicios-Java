//Recebe um número pelo scanner, exibe a tabuada dele.
//Usando ainda recursos básicos. Não utilizei loop

package secao_3;

import java.util.Scanner; 

public class Tabuada {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int num = scanner.nextInt();

        System.out.println("Resultado: " + num + " x 1 = " + (num * 1));
        System.out.println("Resultado: " + num + " x 2 = " + (num * 2));
        System.out.println("Resultado: " + num + " x 3 = " + (num * 3));
        System.out.println("Resultado: " + num + " x 4 = " + (num * 4));
        System.out.println("Resultado: " + num + " x 5 = " + (num * 5));
        System.out.println("Resultado: " + num + " x 6 = " + (num * 6));
        System.out.println("Resultado: " + num + " x 7 = " + (num * 7));
        System.out.println("Resultado: " + num + " x 8 = " + (num * 8));
        System.out.println("Resultado: " + num + " x 9 = " + (num * 9));
        System.out.println("Resultado: " + num + " x 10 = " + (num * 10));
        

        scanner.close();
    }
    
}
