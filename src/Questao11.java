/*
    Construa um programa que simule uma transferencia bancária, entre duas contas.
    Primeiro, inicialize cada conta com R$ 100. Depois, permita que o usuário defina quanto deve transferir,
    da conta 1 para a conta 2, porém a tranferencia só deve ser realizada caso haja saldo suficiente.
 */
import java.util.Scanner;

public class Questao11 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String args[]){
        float conta1= 100,conta2 = 100;

        System.out.println("-------------------");
        System.out.println("Saldo Conta 1: "+conta1);
        System.out.print("Quanto deseja tranferir? ");
        float valor = scanner.nextFloat();
        System.out.println("-------------------");
        if(valor > conta1){
            System.out.print("Saldo insuficiente, tente novamente");
        } else{
            conta1 = conta1-valor;
            conta2 = conta2+valor;
            System.out.println("Saldo da Conta 2: "+conta2);
            System.out.println("Saldo Conta 1: "+conta1);

        }

        
    }
}
