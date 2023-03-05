import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    Construa um programa CODIFICADOR que receba um arquivo de texto de entrada e codifique
    ele usando um padrão de troca de letras.
    Após esse processamento, gere um arquivo codificado.
    Construa outro programa, que funcionará como DECODIFICADOR, que seja capaz de ler o arquivo
    codificado e produzir um arquivo de texto decodificado, que deve ser o mesmo texto original.
    Padrão de troca de letras para codificar um texto: 
    Z <--> P
    E <--> O 
    N <--> L
    I <--> A
    T <--> R
 */
public class Questao40 {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------

        //Lendo arquivo de entrada
        try {
            BufferedReader ler = new BufferedReader(new FileReader("src/entrada.txt"));
            String linha;
            StringBuilder texto = new StringBuilder();
            while ((linha = ler.readLine()) != null) {
                texto.append(linha);
                texto.append(System.lineSeparator());
            }
            ler.close();

            // Codificação do conteúdo
            String conteudoCodificado = codificar(texto.toString());

            // Escrita do conteúdo codificado no arquivo de saída
            BufferedWriter escritor = new BufferedWriter(new FileWriter("src/saida.txt"));
            escritor.write(conteudoCodificado);
            escritor.close();

            System.out.println("Codificação concluída com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao ler ou gravar arquivo: " + e.getMessage());
        }

        try {
            // Leitura do arquivo de entrada
            BufferedReader ler = new BufferedReader(new FileReader("src/saida.txt"));
            String linha;
            StringBuilder texto = new StringBuilder();
            while ((linha = ler.readLine()) != null) {
                texto.append(linha);
                texto.append(System.lineSeparator());
            }
            ler.close();

            // Codificação do conteúdo
            String conteudoCodificado = Decodificar(texto.toString());

            // Escrita do conteúdo codificado no arquivo de saída
            BufferedWriter escritor = new BufferedWriter(new FileWriter("src/saidaDeco.txt"));
            escritor.write(conteudoCodificado);
            escritor.close();

            System.out.println("Decodificação concluída com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao ler ou gravar arquivo: " + e.getMessage());
        }
    }

//###########################################################################
//############################### CODIFICADOR ###############################
//###########################################################################
    private static String codificar(String texto) {
        //Letras que serão trocadas
        String trocaEntrada = "ZENITPOLAR";
        char[] trocaSaida = {'P', 'O', 'L', 'A', 'R', 'Z','E','N', 'I','T'};

        // Conversão do texto para letras maiúsculas
        texto = texto.toUpperCase();

        // Troca das letras de acordo com o padrão de troca
        StringBuilder textoCodificado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            int posicao = trocaEntrada.indexOf(letra);
            if (posicao != -1) {
                letra = trocaSaida[posicao];
            }
            textoCodificado.append(letra);
        }
        return textoCodificado.toString();
    }
//###########################################################################
//############################## DECODIFICADOR ##############################
//###########################################################################
    private static String Decodificar(String texto) {
        //Letras que serão trocadas
        String trocaEntrada = "ZENITPOLAR";
        char[] trocaSaida = {'P', 'O', 'L', 'A', 'R', 'Z','E','N', 'I','T'};

        // Conversão do texto para letras maiúsculas
        texto = texto.toUpperCase();

        // Troca letras
        StringBuilder Decodificar = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            int posicao = trocaEntrada.indexOf(letra);
            if (posicao != -1) {
                letra = trocaSaida[posicao];
            }
            Decodificar.append(letra);
        }
        return Decodificar.toString();
    }
}
