/*
    Construa um programa que leia um número inteiro e identifique
    se ele é par ou impar.
 */
import java.util.Scanner;

public class Questao10 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        int num;

        System.out.print("Digite um numero inteiro: ");
        num = scanner.nextInt();
        System.out.println();

        if((num%2) == 0){
            System.out.print("Este numero é par");
        } else{
            System.out.print("Este numero é impar");
        }
    }
}
