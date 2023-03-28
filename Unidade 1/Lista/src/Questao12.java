/*
    Distinguir, com base na média parcial do aluno, se ele está aprovado,
    reprovado ou na final. Aplique as regras da ufersa.
 */
import java.util.Scanner;

public class Questao12 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Nota 1: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Nota 2: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Nota 3: ");
        float nota3 = scanner.nextFloat();

        float media = ((nota1+nota2+nota3)/3);

        if(media>=7){
            System.out.print("Aprovado");
        } else{
            if(media>=3.5){
                System.out.print("Recuperação");
            } else {
                System.out.print("Reprovado");
            }
        }
    }
}
