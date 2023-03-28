/*
    Construa um programa que conte a quantidade de vezes que as letras de uma palavras aparecem.
    Exemplo: "casa" Resultado: c=1 a=2 s=1
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao33 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("Escreva uma palavra: ");
        String frase = scanner.nextLine(); 
                 
        Map<Character, Integer> contLetras = new HashMap<>();
        
        int tam = frase.length();
        for(int i = 0; i < tam; i++){
           char comparar = frase.charAt(i);
           //containsKey verifica se o caracter com parâmetro i esta no map
            if(contLetras.containsKey(comparar)){
                contLetras.put(comparar, contLetras.get(comparar) + 1);
            } else{
                contLetras.put(comparar, 1);
            }
            frase.substring(i);
        }
        // entrySet retorna um conjunto com os mesmos elementos do mapa de hash.
        for (Map.Entry<Character, Integer> key : contLetras.entrySet()) {
            System.out.println(key.getKey() + "=" + key.getValue());
        }
    }

}
