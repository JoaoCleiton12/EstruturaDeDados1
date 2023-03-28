    /*
        Construa um programa que mova o número da ultima posição do vetor para a primeira. Faça isso gradativamente:
        use uma estrutura de repetição, e em cada interação do loop mova esse número apenas uma posição, ou seja,
        troque esse número da posição n por n-1.
    */
public class Questao29 {
        
    public static void main(String args[]){
        int vet[] = {1,2,3,4,5};
        
        System.out.print("Antes de mudar:   ");
        for(int i = 0; i < 5; i++){
            System.out.print(vet[i]+" ");
        }

        System.out.println();
        int temp;
        for(int i = 4;i>=0;i--){
            temp = vet[i];
            if(i == 0){
                vet[i] = temp;
            } else if(i > 0){
                vet[i-1] = temp;
                vet[i] = 0;
            }

            System.out.print("Andando 1 posição ");
            for(int l = 0;l<5;l++){
                System.out.print(vet[l]+" ");
            }
            System.out.println();
        }
    }
}
