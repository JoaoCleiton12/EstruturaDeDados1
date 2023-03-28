/*
    Construa um programa que inverta a frase digitada pelo usuário. Por exemplo,
    se string1 for "bom dia", então string2 será "aid mob".
 */

 import java.util.Scanner;

public class Questao30 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        
        System.out.print("Digite uma frase para ser invertida: ");
        String frase = scanner.nextLine();
        String frase2 = "";
        //.length pega o tamanho da string
        for(int i = frase.length()-1; i>=0; i--){
            //.chartAt() navega por cada posição da string
            frase2= frase2+ frase.charAt(i);
        }
        System.out.print("Frase invertida: "+frase2);
    }
}
