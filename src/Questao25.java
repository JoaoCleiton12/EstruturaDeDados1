/*
    Construa um programa pra ler e exibir um vetor de inteiros. Em tempo de execução,
    o usuário pode definir o tamanho do vetor.
 */
import java.util.Scanner;

public class Questao25 {
    

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("Digite o tamanho do vetor: ");
        int tam = scanner.nextInt();

        int vet[] = new int[tam];

        for(int i = 0; i<tam;i++){
            vet[i] = scanner.nextInt();
        }
        System.out.print("Exibindo vetor: ");
        for(int i = 0; i<tam;i++){
            System.out.print(vet[i]+" ");
        }
    }
}
