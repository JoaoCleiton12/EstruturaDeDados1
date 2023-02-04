import java.util.Scanner;

public class Questao03 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int num1, num2, soma, subtração, multipli, divisao, resto;

        System.out.print("Numero inteiro 1: ");
        num1 = scanner.nextInt();
        System.out.print("Numero inteiro 2: ");
        num2 = scanner.nextInt();

        soma = num1+num2;
        subtração = num1-num2;
        multipli = num1*num2;
        divisao = num1/num2;
        resto = num1%num2;

        System.out.println("------------------");
        System.out.println("soma: "+soma);
        System.out.println("subtracao: "+subtração);
        System.out.println("multiplicacao: "+multipli);
        System.out.println("divisao: "+divisao);
        System.out.println("resto: "+resto);
    }
}
