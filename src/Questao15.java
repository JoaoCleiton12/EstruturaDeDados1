import java.util.Scanner;

public class Questao15 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("Digite um numero inteiro: ");
        int num = scanner.nextInt();

        if(num>=1 && num<=5){
            
            switch (num){
                case 1:
                System.out.print("Um");
                break;
                case 2:
                System.out.print("Dois");
                break;
                case 3:
                System.out.print("Três");
                break;
                case 4:
                System.out.print("Quatro");
                break;
                default:
                System.out.print("Cinco");
                break;
            }
        } else{
            System.out.println("Valor inválido");
        }
        
    }

}
