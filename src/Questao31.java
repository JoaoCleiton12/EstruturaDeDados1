/*
    Construa um programa que registre objetos da classe Pessoa, Com os seguintes atributos:
    cpf,nome,idade,sexo,peso,altura,imc. Permita que o usuário defina a quantidade de pessoas em tempo
    de execução. Ao cadastrar uma pessoa, calcule o IMC. Ao final, exiba a lista de pessoas(com seus atributos).
 */

 import java.util.ArrayList;
import java.util.Scanner;

 public class Questao31 {
 
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
        System.out.println("Pessoas cadastradas:");
        System.out.println("CPF\t\tNome\tIdade\tSexo\tPeso (kg)\tAltura (m)\tIMC");
        for (Pessoa temp : individuos) {
            System.out.println(temp.getCpf() + "\t" + temp.getNome() + "\t" + temp.getIdade() + "\t" + temp.getSexo() +
                               "\t" + temp.getPeso() + "\t\t" + temp.getAltura() + "\t\t" + temp.calcularIMC());
        }
    }
}


 