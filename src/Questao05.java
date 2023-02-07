/*
    Calcular e exibir a média aritmética de três números reais.
 */
import java.util.Scanner;

public class Questao05 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        double num1,num2,num3,media;

        System.out.print("num1: ");
        num1 = scanner.nextDouble();
        System.out.print("num2: ");
        num2 = scanner.nextDouble();
        System.out.print("num3: ");
        num3 = scanner.nextDouble();

        media = ((num1+num2+num3)/3);

        System.out.println("Media: "+media);
    }
}
