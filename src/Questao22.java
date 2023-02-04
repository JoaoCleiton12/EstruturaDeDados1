import java.util.Scanner;

public class Questao22 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("Numero inicial: ");
        int numInicial = scanner.nextInt();
        System.out.print("Numero final: ");
        int numFinal = scanner.nextInt();
        int somatorio = 0;
        System.out.println();
        while(numInicial<=numFinal){
            somatorio += numInicial++;
        }
        System.out.print("Resultado: "+somatorio);
    }
}
