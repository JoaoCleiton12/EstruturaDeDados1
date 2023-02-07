/*
    Construa e use uma função que produz um novo vetor de inteiros com a ordem
    inversa do vetor original passado por parâmetro.
 */
import java.util.Scanner;

public class Questao27{
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
       int vet[] = new int[5];
       
       System.out.println("Lendo vetor");
       for(int i=0; i<5;i++){
        vet[i] = scanner.nextInt();
       }
        //exibir primeiro
        System.out.print("Vetor na ordem certa: ");
        for(int i=0;i<5;i++){
            System.out.print(vet[i]+" ");
        }
        //exibir inverso
        inverso(vet);
        
    }
     
    public static void inverso(int[] vt ){
        int vtVolta[] = new int[5];
        for(int i=0; i<5;i++){
            vtVolta[i] = vt[4-i];
        }
        System.out.print("Vetor na ordem inversa: ");
        for(int i=0;i<5;i++){
            System.out.print(vtVolta[i]+" ");
        }
    }
   
}
