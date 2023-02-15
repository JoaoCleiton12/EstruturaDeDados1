/*
    Construa um programa que registre objetos da classe Pessoa, Com os seguintes atributos:
    cpf,nome,idade,sexo,peso,altura,imc. Permita que o usuário defina a quantidade de pessoas em tempo
    de execução. Ao cadastrar uma pessoa, calcule o IMC. Ao final, exiba a lista de pessoas(com seus atributos).
 */

 import java.util.Scanner;

 public class Questao31 {
 
     private static Scanner scanner = new Scanner(System.in);
 
     public static void main(String args[]){
         System.out.print("Quantas pessoas serão cadastradas: ");
         int tam = scanner.nextInt();
        
         Pessoa individuo[] = new Pessoa[1];
         System.out.println("Cadastrando uma nova pessoa:");
             System.out.print("Nome: ");
             String nome = scanner.nextLine();
             individuo[0].setNome(nome);
         /* for(int i = 0; i<tam;i++){
             System.out.println("Cadastrando uma nova pessoa:");
             System.out.print("Nome: ");
             String nome = scanner.nextLine();
             individuo[i].setNome(nome);
             System.out.print("idade: ");
             int idade = scanner.nextInt();
             individuo[i].setIdade(idade);
             System.out.print("cpf: ");
             int cpf = scanner.nextInt();
             individuo[i].setCpf(cpf);
             System.out.print("sexo: ");
             String sexo = scanner.nextLine();
             individuo[i].setSexo(sexo);
             System.out.print("peso: ");
             float peso = scanner.nextFloat();
             individuo[i].setPeso(peso);
             System.out.print("altura: ");
             float altura = scanner.nextFloat();
             individuo[i].setAltura(altura);
         } */
 
         System.out.print(individuo[0].getNome());
 
     }
     
 }
 