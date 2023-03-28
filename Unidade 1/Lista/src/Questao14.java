/*
    Construa um programa que calcule uma equação do 2° grau
    Crie uma função com retorno para calcular o delta.
    Crie uma função sem retorno para calcular as raizes.
 */
import java.util.Scanner;

public class Questao14 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("Valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Valor de b: ");
        int b = scanner.nextInt();
        System.out.print("Valor de c: ");
        int c = scanner.nextInt();

         int D = delta(a,b,c); 

        if(D<0){
            System.out.print("Equação não possui resultados reais, pois Delta = "+ D);
        } else{
            if(D==0){
                System.out.println("Delta = "+ D);
                System.out.print("Raizes x1 = x12 = "+bhaskara(D, b, a, 1));
            } else{
                System.out.println("Raiz x1 = "+bhaskara(D, b, a, 1));
                System.out.println("Raiz x2 = "+bhaskara(D, b, a, -1));
            }
        }

    }

    public static int delta(int a, int b, int c) {
        int delta = ((b*b)-4*a*c);
        return delta;
    }

    public static int bhaskara(int D, int b, int a, int sinal){
        int raiz = (int) Math.sqrt(D);

        int x = (((-b)+(sinal*raiz))/(2*a));
        return x; 
    }
}
