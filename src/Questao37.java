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
        System.out.println("Solução A ");
        for(int i = inicio; i <= fim;i++){
            soma += i;
        }
        System.out.println("Soma: "+soma);
        
        System.out.println();

        //resolução B
        System.out.println("Solução B ");
        System.out.print("Soma: "+Somatorio(inicio, fim));
        
        //C
        /*
         * Usar um método recursivo é util quando estamos tratando um problema que
         * naturalmente tende ter uma lógica recursiva, porém não é tão eficiente
         * quanto utilizar um loop.
         */
    }

    public static int Somatorio(int inicio, int fim){
        int resultado;
        //vai chegar uma hora que o inicio vai ser igual ao fim, logo eu não posso chamar o somatório mais uma vez
        if(inicio == fim){
            return inicio;
        } else{
            resultado = inicio + Somatorio(inicio+1, fim);
            return resultado;
        }
        
    }
}
