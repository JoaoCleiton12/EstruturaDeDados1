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
