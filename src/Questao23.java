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
