import java.util.Scanner;

public class Questao01 {
    
    private static Scanner ler = new Scanner(System.in);
    public static void main(String args[]){
        
        Stack<String> pilha = new Stack<>(5);

        System.out.println();
        System.out.println("*********************");
        System.out.println("Lavadora de pratos");
        System.out.println("*********************");
        System.out.println();
        System.out.println();
        System.out.println("*************Menu*************");
        System.out.println("1 - ver quantidade de pratos");
        System.out.println("2 - colocar prato sujo");
        System.out.println("3 - lavar prato");
        System.out.println("0 - sair");
        System.out.println("******************************");
        int escolha = ler.nextInt();
        System.out.println();
        while (escolha != 0) {
            switch (escolha) {
                case 1:
                    if(pilha.empy() == true){
                        System.out.println("Não tem nenhum prato na sua pilha de pratos");
                    }else{
                        pilha.show();
                    }
                    break;
                case 2:
                    if(pilha.full()){
                        System.out.println("a pilha de pratos ja possui muitos pratos");
                    }else{
                        pilha.add("Prato");
                        System.out.println("prato empilhado");
                    }
                    break;
                case 3:
                    if(pilha.empy()){
                        System.out.println("todos os pratos ja foram lavados");
                    }else{
                        pilha.remove();
                        System.out.println("prato desempilhado");
                    }
                    break;
                default:
                    break;
            }
            System.out.println();
            System.out.println("*************Menu*************");
            System.out.println("1 - ver quantidade de pratos");
            System.out.println("2 - colocar prato sujo");
            System.out.println("3 - lavar prato");
            System.out.println("0 - sair");
            System.out.println("******************************");
            escolha = ler.nextInt();
            System.out.println("---------------------------------------------");
            System.out.println();
        }

        



    }
}
