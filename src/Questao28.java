/*
    Construa um programa que identifique o maior e menor número de um vetor de inteiros.
 */
import java.util.Scanner;

public class Questao28 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        int vet[] = {6,2,3,11,5};
        int menor =0, maior = 0;
        for(int i = 0;i<5;i++){
            menor = vet[i];
            maior = vet[i];
            for(int j =0;j<5;j++){
                if(menor>vet[j]){
                    menor = vet[j];
                }
                if(maior<vet[j]){
                    maior=vet[j];
                }
            }
            
        }
        System.out.println("Menor valor: "+menor);
        System.out.print("Maior valor: "+maior);
    }
}
