import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*
    Evolua a questão anterior. Permita que o programa salve o resultado em um
    arquivo binário. Permita que o programa abra o arquivo binário e exiba o conteúdo na tela.
 */
public class Questao32 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //criando lista de pessoas
        ArrayList<Pessoa> individuos = new ArrayList<Pessoa>();

        System.out.print("Quantas pessoas serão cadastradas? ");
        int tam = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < tam; i++) {
            System.out.print("Cadastrando pessoa "+ (i+1));
            System.out.print("\nCPF: ");
            long cpf = scanner.nextLong();
            // pegar quebra de linha
            scanner.nextLine(); 
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: " );
            int idade = scanner.nextInt();
            // pegar quebra de linha
            scanner.nextLine();
            System.out.print("Sexo: " );
            String sexo = scanner.nextLine();
            System.out.print("Peso: " );
            double peso = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            Pessoa temp = new Pessoa(cpf, nome, idade, sexo, peso, altura);
            individuos.add(temp);
        }
        System.out.println();
        System.out.println("--------------------------");
        
        //criando arquivo binário e salvando o conteúdo de pessoa nele.
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("individuos.dat"))) {
            for (Pessoa pessoa : individuos) {
                outputStream.writeObject(pessoa);
            }
        } catch (IOException e) {
            System.out.println("Erro na escrita: " + e.getMessage());
            }

        //abrindo arquivo binário para ler e exibir o conteúdo dele.
        System.out.println("Pessoas cadastradas:");
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("individuos.dat"))) {
                while (true) {
                    Pessoa pessoa = (Pessoa) inputStream.readObject();
                    System.out.println(pessoa);
                }
            } catch (EOFException e) {
            // fim do arquivo, não faz nada
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro na leitura: " + e.getMessage());
            }
    }
}
