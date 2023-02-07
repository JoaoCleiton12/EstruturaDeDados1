import java.util.Scanner;

public class Questao29 {
    /*
        Construa um programa que mova o número da ultima posição do vetor para a primeira. Faça isso gradativamente:
        use uma estrutura de repetição, e em cada interação do loop mova esse número apenas uma posiçãp, ou seja,
        troque esse número da posição n por n-1.
    */    

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        int vet[] = {1,2,3,4,5};
        
        System.out.print("Antes de mudar: ");
        for(int i = 0; i < 5; i++){
            System.out.print(vet[i]+" ");
        }
        int temp;
        for(int i = 0;i<5;i++){
            if(i==0){
                temp = vet[i+4];
            }
            
            
        }
    }
}
