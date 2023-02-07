/*
    Construa um programa que calcule o fatorial de um número. Use uma estrutura de repetição.
    Fatorial: n! = n(n-1)!
    exemplo: 5! = 5*4*3*2*1 = 120
 */
import java.util.Scanner;

public class Questao23 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("Numero inicial: ");
        int num = scanner.nextInt();
        int fatorial = 1;
        System.out.println();
        
        for(int i = 1; i<=num; i++){
            fatorial *= i;
        }
        System.out.print("Fatorial de "+num+" é: "+fatorial);
    }
}
