/*
    Construa um programa que calcule o rendimento mensal de um investimento em poupança.
    Variáveis: investimento inicial, investimento mensal, quantidade de meses, saldo acumulado,
    taxa de juros mensal, rendimento mensal.
 */
import java.util.Scanner;

public class Questao20 {
    
    private static Scanner scanner = new Scanner(System.in);
    final static float TAXA = 0.05f;
    public static void main(String args[]){
        System.out.print("Investimento Inicial: ");
        float investIncial = scanner.nextFloat();
        System.out.print("Investimento Mensal: ");
        float investMensal = scanner.nextFloat();
        System.out.print("Quantidade de meses: ");
        int meses = scanner.nextInt();
        System.out.println();

        float rendiMensal, saldoAcumu;
        saldoAcumu = investIncial;
        for(int i = 1; i<=meses; i++){
            rendiMensal =  investMensal*TAXA;
            saldoAcumu += (rendiMensal+investMensal);
            System.out.println("Rendimento mes "+i+": "+rendiMensal);
            System.out.println("Saldo acumulado do mes "+i+": "+saldoAcumu);
            System.out.println();
        }

    }
}
