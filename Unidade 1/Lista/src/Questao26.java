/*
    Construa um programa pra ler e exibir uma matriz de inteiros. Em tempo de execução,
    o usuário pode definir o tamanho da matriz.
 */
import java.util.Scanner;

public class Questao26 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("Digite a quantidade de linhas: ");
        int linha = scanner.nextInt();
        System.out.print("Digite a quantidade de colunas: ");
        int coluna = scanner.nextInt();

        int vet[][] = new int[linha][coluna];

        for(int i = 0; i<linha;i++){
            for(int j = 0; j<coluna;j++){
                vet[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i<linha;i++
        ){
            System.out.println();
            for(int j = 0; j<coluna;j++){
                System.out.print(vet[i][j]+" ");
            }
        }
    }
}
