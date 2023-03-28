/*
    Construa e use uma função para calcular o fatorial de um número utilizando recursividade.
 */

 import java.util.Scanner;


public class Questao36 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Digite um numero para calcular seu fatorial: ");
        int numero = scanner.nextInt();

        System.out.println();
        System.out.print("Fatorial: "+fatorial(1, numero));
    }
    
    //como o primeiro número do fatorial de todo número é 1.
    //podemos usar a mesma lógica usada para calcular o somatório em um intervalo.
    //onde o começo do intervalo seria o número 1 e o fim seria o número que o usuário digitou.
    public static int fatorial(int inicio, int num){
        int resultado = 0; 
        if(num == inicio){
            return inicio;
        } else{
            resultado = inicio * fatorial(inicio+1, num);
            return resultado;
        }
    }
}
