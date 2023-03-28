/*
    Evolua a questao34. Permita que o programa salve o resultado em um arquivo de texto CSV:
    Permita que o programa abra o arquivo texto CSV e exiba o conteúdo na tela.
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao35 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        
        // Criando arquivo de texto
        File arquivo = new File("temp/arquivo1_texto.csv");

        //pedindo frase o usuário
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
        //escrita
        try {
            FileWriter escrever = new FileWriter(arquivo);
            for (String comparacao : cont.keySet()) {
                escrever.append(comparacao+" : "+cont.get(comparacao)+ "\n");
            }
            escrever.close();

            // Abre o arquivo e exibe o conteúdo na tela
            Scanner leitor = new Scanner(arquivo);
            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
