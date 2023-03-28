/*
    Calcular o IMC de uma pessoa. Produza um alerta em caso de divisão por zero.
 */
import java.util.Scanner;

public class Questao08 {
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String args[]){
        double imc, peso, altura;

        System.out.print("Peso: ");
        peso = scanner.nextDouble();
        System.out.print("Altura: ");
        altura = scanner.nextDouble();

        if(altura == 0){
            System.out.print("Alerta, sua altura nao pode ser zero");
        } else{
            imc = (peso/(altura*altura));

            System.out.print("IMC: "+imc);
        }
    }
}
