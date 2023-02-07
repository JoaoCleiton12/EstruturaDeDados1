/*
    Verifique se a senha, informada durante a execução, é correta. Quando a senha estiver correta, exiba "senha correta"
    e o programa é encerrado. Quando a senha estiver errada, exiba "senha incorreta", e permita a entrada novamente da senha,
    repetindo esse processo ate que a senha entrada seja correta.
    a)Construa este programa utilizado a estrutura while.
    b)Construa este programa utilizado a estrutura do-while.
 */
import java.util.Scanner;

public class Questao18 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        //tirar um do comentario e colocar o outro para testar

        /*

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        System.out.println();

    
        while(!(senha.equals("java123"))){
            System.out.print("Senha incorreta: ");
            senha = scanner.nextLine();
            System.out.println();
        }
        System.out.println("Senha correta");

        */
        int controle = 0;
        String senha;
        do{
            if(controle == 0){
                System.out.print("Digite a senha: ");
                senha = scanner.nextLine();
                controle = 1;
            }else{

                System.out.print("Senha incorreta: ");
                senha = scanner.nextLine();
                System.out.println();
            }
        }while(!(senha.equals("java123")));

        System.out.println("Senha correta");
    }
}
