import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
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
  A diferença se da em relação a inserção e acesso aos elementos, pois o queueLinkedList é uma fila
  que mantém a ordem de inserção dos elementos. Já o PriorityQueue é uma fila de prioridade em que a ordenação
  é de acordo com a prioridade dos elementos.
*/

        //PriorityQueue
        System.out.println("PriorityQueue");
        Queue<String> NumPriorityQueue = new PriorityQueue<String>(); 
        //insere sempre no sim
        NumPriorityQueue.add("um"); 		
        NumPriorityQueue.add("dois"); 		
        NumPriorityQueue.add("tres");
        NumPriorityQueue.add(null);
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
        System.out.println("LinkedList");
        Queue<String> numQueueLinkedList = new LinkedList<String>();
		
        numQueueLinkedList.add("dois"); 
        numQueueLinkedList.add("tres"); 		
        numQueueLinkedList.add("um"); 
        //permite repeticao				
        numQueueLinkedList.add(null); 		
	System.out.println(numQueueLinkedList);
        //consulta o inicio
	System.out.println("inicio: " + numQueueLinkedList.peek()); 		
	//remove do inicio
	System.out.println("removed: " + numQueueLinkedList.remove());
	System.out.println(numQueueLinkedList);
	System.out.println();
//--------------------------------------------------------------------------

//###########################################################################
//############################# Deque LinkedList ############################
//###########################################################################
/*
  O deque LinkedList é uma fila duplamente encadeada que não garante uma ordem específica 
  e permite a inserção e remoção de elementos em ambas as extremidades da fila.
*/ 

        //Deque
        System.out.println("Deque LinkedList");
        Deque<String> numDeque = new LinkedList<String>();

        numDeque.add("Um");
        numDeque.add("Dois");
        numDeque.add("Tres");
        System.out.print(numDeque);
        
        System.out.println();

        //Add elemento no início
        numDeque.addFirst("Zero");
        //Add elemento no final
        numDeque.addLast("Quatro");
        System.out.print(numDeque);
        
        System.out.println();

        //consulta o início
        //peedFirst também funciona
        System.out.println("Inicio: " + numDeque.peek());
   
        //consulta fim
        System.out.println("fim: "+numDeque.peekLast());

        //remove inicio
        //removeFirst também funciona
        numDeque.remove();
        //remove fim
        numDeque.removeLast();
        System.out.print(numDeque);

        System.out.println();
        System.out.println();
//--------------------------------------------------------------------------

//###########################################################################
//############# Diferenças entre HashMap, LinkedHashMap, TreeMap ############
//###########################################################################
/*
  A difereça se da pelos seguintes aspectos, o HashMap oferece a melhor performance, mas não garante 
  nenhuma ordenação para os elementos. O LinkedHashMap mantém a ordem de inserção. é o TreeMap por sua vez, 
  ordena automaticamente os elementos com base em sua chave.
  
*/

        //HashMap
        System.out.println("HashMap");
	Map<String, Integer> numhashMap = new HashMap<String, Integer>();
	numhashMap.put("um", 1);
	numhashMap.put("dois", 2 );
	numhashMap.put("tres", 3);
        numhashMap.put(null, 0);
        System.out.println( numhashMap );
        // Substitui o elemento que também tinha chave "tres" 
        numhashMap.put("tres", 4);
	System.out.println( numhashMap );
	numhashMap.remove( "dois" );
	System.out.println( numhashMap.size() );
	System.out.println( numhashMap.keySet() );
        System.out.println();
//--------------------------------------------------------------------------

        //LinkedHashMap
        System.out.println("LinkedHashMap");
	Map<String, Integer> numLinkedHashMap = new LinkedHashMap<String, Integer>();
	numLinkedHashMap.put("um", 1);
	numLinkedHashMap.put("dois", 2);
	numLinkedHashMap.put("tres", 3);
        numLinkedHashMap.put(null, 0);
        System.out.println( numLinkedHashMap );
        // Substitui o elemento que também tinha chave "tres"  
	numLinkedHashMap.put("tres", 4);
	System.out.println( numLinkedHashMap );
	System.out.println( numLinkedHashMap.remove( "dois" ) );
	System.out.println( numLinkedHashMap.size() );
		
	System.out.println( numLinkedHashMap.keySet());
        System.out.println();
//--------------------------------------------------------------------------
        
        //TreeMap
        System.out.println("TreeMap");
	Map<String, Integer> numTreeMap = new TreeMap<String, Integer>();
	numTreeMap.put("um", 1);
	numTreeMap.put("dois", 2);
	numTreeMap.put("tres", 3);
        System.out.println( numTreeMap );
        numTreeMap.put("tres", 4);
        //não permite null
	// numTreeMap.put(null, 0 );	
	System.out.println( numTreeMap );
	System.out.println( numTreeMap.remove( "dois" ) );
	System.out.println( numTreeMap.size() );
		
	System.out.println( numTreeMap.keySet() );
    }
}

