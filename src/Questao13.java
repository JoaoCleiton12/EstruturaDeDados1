/*
    Construa um programa que calcule para o aluno sua média parcial e informa
    sua situação parcial(Aprovado, reprovado ou recuperação).
    Caso ele esteja em recuperação, calcule quanto ele precisa tirar na 4° prova
    para ser aprovado(média final maior ou igual que 5,0)
    Observação: utilize os pesos e regras da ufersa.
 */
import java.util.Scanner;

public class Questao13 {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Nota 1: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Nota 2: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Nota 3: ");
        float nota3 = scanner.nextFloat();

        float mediaP = ((nota1+nota2+nota3)/3);

        if(mediaP>=7){
            System.out.print("Aprovado");
        } else{
            if(mediaP>=3.5){
                System.out.println("Recuperação");

                float pesoParcial = mediaP*6;

                //reorganizando a equação da media final 
                // Mf = ((mediaP*6)+(AvaliFinal*4)/10)
                //teremos
                float AvaliFinal = (((10*5) -(pesoParcial))/4);

                System.out.print("Você precisa de "+AvaliFinal+" para ser aprovado");
            } else {
                System.out.print("Reprovado");
            }
        } 
    }

}
