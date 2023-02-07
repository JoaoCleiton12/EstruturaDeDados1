/*
    Construa um programa que gerencia a conta de uma pizzaria.
    Preço do refrigerante: R$ 1,50. Preço da fatia de pizza: R$ 3,00. Taxa do garçom: 10%
    Receba do usuário: a quantidade de refrigerantes, a quantidade de fatias e a quantidade de pessoas na mesa.
    Calcule e exiba: o total sem a taxa, o total com a taxa, o rateio por pessoa com a taxa.
 */
import java.util.Scanner;

public class Questao06 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("-----------------------------");
        System.out.println("Refrigerante: R$ 1.50");
        System.out.println("Fatia de pizza: R$ 3.00");
        System.out.println("-----------------------------");
        System.out.print("Quantidade de refrigerantes: ");
        int quantrefri = scanner.nextInt();
        System.out.print("Quantidade de fatias de pizza: ");
        int quantpizza = scanner.nextInt();
        System.out.print("Pessoas na mesa: ");
        int quantpessoas = scanner.nextInt();
        System.out.println("-----------------------------");

        double totalSemtaxa = ((quantrefri*1.5)+(quantpizza*3));
        double taxa = (((quantrefri*1.5)+(quantpizza*3))*0.10);
        double totalComtaxa = (totalSemtaxa+taxa);
        double totalPorPessoaComtaxa = (totalComtaxa/quantpessoas);
    
        System.out.println("Total sem taxa: "+totalSemtaxa);
        System.out.println("Total com taxa: "+totalComtaxa);
        System.out.println("Total por pessoa com taxa: "+totalPorPessoaComtaxa);

    }
}
