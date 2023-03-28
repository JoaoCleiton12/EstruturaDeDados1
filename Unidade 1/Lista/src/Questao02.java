/*
    Atributos com valores vindos do teclado variáveis adequadas para:
    idade, altura, primeira letra do nome, nome completo, depois exiba na tela
 */
import java.util.Locale;
import java.util.Scanner;

public class Questao02 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    
        scanner.useLocale(Locale.US);
        
        double altura;
        char primeiLetra;
        String nome;

        System.out.print("idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("altura: ");
        altura = scanner.nextDouble();

        System.out.print("Primeira letra: ");
        primeiLetra = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.print("nome: ");
        nome = scanner.nextLine();

        System.out.println("--------------------");
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);
        System.out.println("primeira letra: " + primeiLetra);
        System.out.println("nome: " + nome);
    }
}
