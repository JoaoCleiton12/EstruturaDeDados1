/*
    Calcular uma divisão entre dois numeros reais. Produza um alerta em caso de divisão por zero.
 */
import java.util.Scanner;

public class Questao07 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        double num1,num2,divisao;

        System.out.print("Numero 1: ");
        num1 = scanner.nextDouble();
        System.out.print("Numero 2: ");
        num2 = scanner.nextDouble();
        System.out.println();
        
        if(num2 == 0){
            System.out.print("Alerta, nao é possivel dividir por zero");
        } else{
            divisao = num1/num2;
            System.out.print(divisao);
        }
    }   
}
