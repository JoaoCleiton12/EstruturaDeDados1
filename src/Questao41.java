import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;;

/*
    Utilizando a Collectin de Java, faça exemplos de uso das classes abaixo e explicite suas diferenças:
    a)List: ArrayList, Vector, LinkedList
    b)Set: HashSet, LinkedHashS, TreeSet
    c)Queue: PriorityQueue, LinkedList
    d)Deque: LinkedList
    e)Map: HashMap, LinkedHashMap, TreeMap
*/
public class Questao41 {

    
    public static void main(String[] args){
//###########################################################################
//############# Diferenças entre ArrayList, Vector, LinkedList ##############
//###########################################################################
/*
  Como veremos abaixo, o ArryList e o Vector são muito semelhantes, os pontos que os diferencia é primeiramente 
  o fato do Vector ser sincronizado(thread-safe) e o ArrayList não, outro fator importante é a questão de alocação
  dinámica do Vector que é de 100% enquanto o ArrayList é 50%, ou seja se o vector tiver um tamanho de 10 e precisar
  expandir, ele aumentará para 20, ja o ArryList se tiver o mesmo tamanho 10, aumentará apenas para 15. Já o LinkedList
  possui também muitas semelhanças com o ArrayList, porém os seus métodos de add e remove são mais eficazes do que os do
  ArrayList entretanto, os métodos get e set não tem um desempenho tão bom comparados aos do ArrayList.
*/
        //ArrayList
        System.out.println("ArrayList");
        List<String> numArry = new ArrayList<String>();
        numArry.add("um");
        numArry.add("dois");
        numArry.add("tres");
        String primeiraNumero = numArry.get(0);
        //Exibe
        System.out.println("Primeira numero: " + primeiraNumero);
        System.out.println("numeros: " + numArry);
        //mudando numero
        numArry.set(1, "4");
        System.out.println("numeros: " + numArry);
        // Remove um elemento do ArrayList
        numArry.remove(2);
        // Imprimindo o ArrayList
        System.out.println("numeros: " + numArry);
        System.out.println();
//---------------------------------------------------------------------------

        //Vector
        System.out.println("Vector");
        List<String> numvet = new Vector<>(10);
        numvet.add("um");
        numvet.add("dois");
        numvet.add("três");
        //Exibe
        System.out.println("O primeiro elemento é: " + numvet.get(0));
        numvet.remove(1);
        //Exibe atualizado
        System.out.println("Elementos do Vector após a remoção:");
        for (String elemento : numvet) {
        System.out.println(elemento);
        }
        System.out.println();
//---------------------------------------------------------------------------

      //LinkedList
      System.out.println("LinkedList");
      LinkedList<String> numLinklist = new LinkedList<>();
      numLinklist.add("Um");
      numLinklist.add("Dois");
      numLinklist.add("Tres");
      //Exibe
      System.out.println("Lista: " + numLinklist);
      //Add um elemento na primeira posição
      numLinklist.addFirst("zero");
      System.out.println("Lista atualizada: " + numLinklist);
      //Add um elemento na última posição
      numLinklist.addLast("quatro");
      System.out.println("Lista atualizada: " + numLinklist);
      //Remove o primeiro elemento
      numLinklist.removeFirst();
      System.out.println("Lista atualizada: " + numLinklist);
      //Remove o último elemento
      numLinklist.removeLast();
      System.out.println("Lista atualizada: " + numLinklist);
      System.out.println();
//---------------------------------------------------------------------------

//###########################################################################
//############# Diferenças entre HashSet, LinkedHashS, TreeSet ##############
//###########################################################################
/*
  O HashSet possui a melhor eficiência no quesito rapidez em relação aos demais, pois
  ela usa HashTable, entretanto não ordena os elementos inseridos. O TreeSet possui um
  mecanismos de ordenação independente da ordem que você inserir os elementos, entretanto
  a complexidade para os métodos add, remove e contains são bem maiores que do HashSet.
  Já o LinkedHashSet podemos defini-lo como um meio termo entre o HashSet e o TreeSet, visto que
  ele implementa um pouco do poder de ordenação do TreeSet, alinhado a uma pouco da boa perfomace
  do HashSet.
*/
        //HashSet
        System.out.println("HashSet");
        Set<String> numHashSet = new HashSet<>();
        numHashSet.add("Um");
        numHashSet.add("Dois");
        numHashSet.add("Tres");
        //Como o numero já foi adicionado, ele não será adicionado novamente
        numHashSet.add("Um"); 
        //Exibe
        System.out.println("numeros: " + numHashSet);
        //Se sim irá retornar True
        System.out.println("Tem Dois? " + numHashSet.contains("Dois"));
        // Se não irá retornar false
        System.out.println("Contém Quatro? " + numHashSet.contains("Quatro")); 
        //Remove
        numHashSet.remove("Dois");
        System.out.println("Tamanho: " + numHashSet.size());
        System.out.println("Contém Bob? " + numHashSet.contains("Dois"));
        System.out.println();
//---------------------------------------------------------------------------

        //LinkedHashSet
        System.out.println("LinkedHashSet");
        Set<Integer> numLinkedHashSet = new LinkedHashSet<>();
        numLinkedHashSet.add(5);
        numLinkedHashSet.add(1);
        numLinkedHashSet.add(3);
        //Como o numero já foi adicionado, ele não será adicionado novamente
        numLinkedHashSet.add(1);
        for (int numero : numLinkedHashSet) {
            System.out.println(numero);
        }
        //Remove
        numLinkedHashSet.remove(1);
        // Se não irá retornar false
        System.out.println("Contém 1? " + numLinkedHashSet.contains(1));
        System.out.println();
//--------------------------------------------------------------------------

        //TreeSet
        System.out.println("TreeSet");
        Set<Integer> numtTreeSet = new TreeSet<>();
        numtTreeSet.add(5);
        numtTreeSet.add(1);
        numtTreeSet.add(3);
        //Como o numero já foi adicionado, ele não será adicionado novamente
        numtTreeSet.add(1);
        for (int numero : numtTreeSet) {
            System.out.println(numero);
        }
        //Remove
        numtTreeSet.remove(1);
        // Se não irá retornar false
        System.out.println("Contém 1? " + numtTreeSet.contains(1));
        System.out.println();
//--------------------------------------------------------------------------

//###########################################################################
//############### Diferenças entre PriorityQueue, LinkedList ################
//###########################################################################
/*
  
  
*/

        //PriorityQueue
        System.out.println("PriorityQueue");
        Queue<String> NumPriorityQueue = new PriorityQueue<String>(); 
        //insere sempre no sim
        NumPriorityQueue.add("um"); 		
        NumPriorityQueue.add("dois"); 		
        NumPriorityQueue.add("tres");
        // permite repeticao 		
        NumPriorityQueue.add("dois"); 		 
        
		System.out.println(NumPriorityQueue); 
		System.out.println("Inicio: " + NumPriorityQueue.peek()); 		
		//um
		System.out.println("remove: " + NumPriorityQueue.remove()); 
		//dois
		System.out.println("remove: " + NumPriorityQueue.remove());	
		System.out.println(NumPriorityQueue); 
        System.out.println();
//--------------------------------------------------------------------------

        //LinkedList
    }

    //d)Deque: LinkedList
    //e)Map: HashMap, LinkedHashMap, TreeMap

}

