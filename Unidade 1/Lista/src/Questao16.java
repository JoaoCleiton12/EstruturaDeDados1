/*
    Construa um programa que leia do usuário um número inicial e um número final. Em seguida, exiba na tela uma sequencia
    com os numeros desse intervalo informado pelo usuario. Exemplo: caso o usuário entre com os números 4 a 10, o resultado
    do programa seria: 4 5 6 7 8 9 10
    a)Construa este programa utilizado a estrutura while.
    b)Construa este programa utilizado a estrutura do-while.
    c)Construa este programa utilizado a estrutura for.
 */
import java.util.Scanner;

public class Questao16 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("Numero inicial: ");
        int numInicial = scanner.nextInt();
        System.out.print("Numero final: ");
        int numFinal = scanner.nextInt();

        System.out.println("While: ");
        int whi = numInicial;
        while(whi<=numFinal){
            System.out.print(whi+" ");
            whi++;
        }
        System.out.println();
        System.out.println("Do While: ");
        int dowhi = numInicial;
        do{
            System.out.print(dowhi+" ");
            dowhi++;
        }while(dowhi<=numFinal);

        System.out.println();
        System.out.println("For: ");
        for(int i = numInicial; i<=numFinal; i++){
            System.out.print(i+" ");
        }

    }
}
