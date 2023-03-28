/*
    Construa um programa para exibir a tabuada de qualquer número "n" (1 a 9), sendo "n" um número
    fornecido pelo usuário. Utilize estrutura de repetição.
 */
import java.util.Scanner;

public class Questao19 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Informe um numero: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada");
        for(int i=1; i<=9;i++){
            System.out.println(i+" x "+numero+" = "+i*numero);
        }
    }
}
