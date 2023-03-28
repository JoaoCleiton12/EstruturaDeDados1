/*
    Construa um programa que conte a quantidade que as palavras de uma frase aparecem.
    Exemplo: "estude muito sempre estude" Resultado:estude=2 muito=1 sempre=2
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao34 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("Escreva uma frase: ");
        String frase = scanner.nextLine();

        //.split separa e garda cada palavra no vetor PalavrasSeparadas
        //.split separa as palavras da frase pelo espaço em branco " "
        String[] PalavrasSeparadas = frase.split(" ");     //pega a quantidade de espaços em branco
        
        Map<String, Integer> cont = new HashMap<>();

         //mesma lógica usada para contar as letras na questão 33.
         for (String comparacao : PalavrasSeparadas) {
            if (cont.containsKey(comparacao)) {
                //se a palavra se repetir ele soma cada vez que a palavra se repetir
                cont.put(comparacao, cont.get(comparacao) + 1);
            } else {

                //se não repetir, ele atribui o valor 1 aquela palavra, pois ela so apareceu uma vez.
                cont.put(comparacao, 1);
            }
        }

        //exibir
        System.out.println("Resultado: ");
        for (String comparacao : cont.keySet()) {
            int quantidade = cont.get(comparacao);
            System.out.println(comparacao + " = " + quantidade);
        }
        
    }
}
