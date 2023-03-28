/*
    Utilizando o recurso Generic de Java, faça um método para exibir um objeto
    (usando seu método toString), e outro método para exibir os elementos de um vetor.
 */

public class Questao38 {
    
    public static void main(String args[]){

        //exibindo
        System.out.println("Exibindo objeto");
        String frase = new String("joao");
        Exibir(frase);

        System.out.println();

        System.out.println("Exibindo Lista de objetos");
        String[] vet = {"Marcelo", "Fernando", "Cleiton"};
        Exibirvetor(vet);
    }
    //método para exibir um objeto
    public static <A> void Exibir(A dado) {
        System.out.println(dado.toString());
    }
    
    //método para exibir elementos de um vetor
    public static <A> void Exibirvetor(A[] vet) {
        for (A run : vet) {
            System.out.print(run.toString() + " ");
        }
    }

}
