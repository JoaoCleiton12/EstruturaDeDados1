/*
    Construa um programa que simule uma calculadora. Disponibilize um menu de opções e simule
    a opção desejada, exibindo novamente o menu, até que o usuário escolha sair. menu de opções:
    1 - potenciação                     Dica:utilize a função da biblioteca matemática.
    2 - raiz quadrada                   Dica:utilize a função da biblioteca matemática.
    3 - fatorial                        Dica:crie e utilize a função com a solução da questão 23.
    0 - sair
 */
import java.util.Scanner;

public class Questao24 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        int escolha;
        do{
        System.out.println("------------------");
        System.out.println("Calculadora");
        System.out.println("1 - potenciação");
        System.out.println("2 - raiz quadrada");
        System.out.println("3 - fatorial");
        System.out.println("0 - sair");
        escolha = scanner.nextInt();
        System.out.println("------------------");
        System.out.println("");

            if(escolha == 1){
                System.out.print("base: ");
                int base = scanner.nextInt();
                System.out.print("expoente");
                int expoente = scanner.nextInt();
                System.out.println("resultado: "+Math.pow(base, expoente));
            }
            if(escolha == 2){
                System.out.print("numero: ");
                int numero = scanner.nextInt();
                System.out.println("resultado: "+Math.sqrt(numero));
            }
            if(escolha == 3){
                System.out.print("Numero: ");
                int numero = scanner.nextInt();
                System.out.println("resultado: "+fatorial(numero));
            }
        }while(escolha != 0);
    }

    public static int fatorial(int num){
        int fatorial = 1;
        for(int i = 1; i<=num; i++){
            fatorial *= i;
        }
        return fatorial;
    }
}

