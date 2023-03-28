/*
    Construa um programa que calcule a área de um circulo, tendo como entrada
    o valor do raio, que deve ser positivo. Use o valor da constante PI vindo
    da biblioteca matemática.
 */
import java.util.Scanner;

public class Questao09 {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        
        double areaCirculo, raio;

        System.out.print("raio: ");
        raio = scanner.nextDouble();
        areaCirculo = (Math.PI * (raio*raio));

        System.out.print("area do circulo: "+areaCirculo);

    }
}
