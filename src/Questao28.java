import java.util.Scanner;

public class Questao28 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        int vet[] = {6,2,3,4,5};
        int menor =0;
        for(int i = 0;i<5;i++){
            menor = vet[4-i];
            if(vet[i]<menor){
                menor = vet[i];
            }
        }
        System.out.print("Menor valor: "+menor);
    }
}
