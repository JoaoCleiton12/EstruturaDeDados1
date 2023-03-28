/*
    Construa um programa que identifique se um número é primo.
 */
import java.util.Scanner;

public class Questao21 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();
        // 1=nao é primo
        // 0=é primo
        
        if(verPrimo(num)&&(num!=1)){
            System.out.print("é primo");
        }else{
            System.out.print("Não é primo");
        }
        
    }

    private static boolean verPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero%i == 0){
                return false;  
            } 
        }
        return true;
    }
}
