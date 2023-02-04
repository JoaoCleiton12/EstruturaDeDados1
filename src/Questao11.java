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
