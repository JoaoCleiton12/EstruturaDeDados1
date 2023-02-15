import java.util.Scanner;

/*
    Calcule o somatório dos números inteiros do intervalo entre dois números. No mesmo programa,
    implemente esse cálculo em duas funções:
    a)Resolva o problema com estrutura de repetição.
    b)Resolva o problema com recursividade.
    c)Analise os pontos positivos e negativos de cada versão.
 */
public class Questao37 {
    /**
     * @param args
     */
    public static void main(String args[]){
        //intervalo
        int inicio = 1;
        int fim = 5;

        //resolução A
        int soma = 0;
        for(int i = inicio; i <= fim;i++){
            soma += i;
        }
        System.out.print("Soma: "+soma);
    }
}
