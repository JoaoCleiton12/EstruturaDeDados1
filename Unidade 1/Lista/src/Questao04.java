/*
    Calcular e exibir a média aritmética de três números inteiros.
 */
import java.util.Scanner;

public class Questao04 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int num1,num2,num3, media;

        System.out.print("numero 1: ");
        num1 = scanner.nextInt();
        System.out.print("numero 2: ");
        num2 = scanner.nextInt();
        System.out.print("numero 3: ");
        num3 = scanner.nextInt();

        media = ((num1+num2+num3)/3);

        System.out.println("Media: "+media);
    }
}
