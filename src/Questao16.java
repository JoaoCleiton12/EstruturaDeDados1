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
