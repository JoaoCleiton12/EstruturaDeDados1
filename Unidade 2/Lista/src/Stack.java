public class Stack<T> {
    
    int size;                                               //Variável para definir o tamanho da pilha.
    int top;                                                //Variável para ter controle de qual elemento esta no topo da pilha.
    private Object[] array;                                 //Vetor no qual os elementos da pilha serão adicionados.




    //classe para inicializar os atributos acima
    public Stack(int size){
        top = -1;                                           //top será iniciado com -1, dessa forma podemos perceber que a pilha esta vazia.
        this.size = size;                                   //size recebera o valor passado por paramentro no momento da criação de uma pilha.
        this.array = new Object[size];                      //o array recebe o tamanho passado por paramentro.
    }


    

//--------------------------------------------------------------------------------------------------------------------------------
    //Função de adicionar elementos
    public void add(T num){

        /*  quando o elemento que esta no topo da 
            pilha for igual ao tamanho da pilha
            iremos informar que a pilha esta cheia
        */
        if(full()){
             System.out.println("Pilha esta cheia!");
        }

        
        //enquanto a pilha não estiver cheia
        top = top +1;                                       //top +1 pois inicializamos nossa pilha com -1, e -1 + 1 = 0
        array[top] = num;                                   //adiciona o elemento na posição top
    }
//--------------------------------------------------------------------------------------------------------------------------------
    //Função de remover elementos
    public T remove(){
        T num;        
       
        if(empy()){
            System.out.println("Pilha esta vazia");
        }


        //enquanto a pilha não estiver vazia
        num = (T) array[top];                               //salva o elemento do top na variavel que sera retornada
        array[top] = null;                                  //Colocar muda o elemento "removido" para null
        top = top-1;                                        //atualiza o top
        return num; 
    }
//--------------------------------------------------------------------------------------------------------------------------------
    //Função de consultar elementos
    public T check(){
        T num;
        /*
            quando o elemento que esta no topo da 
            pilha for igual a -1, isso significa que
            a pilha esta vazia.
        */
        if(top == -1){
            System.out.println("Pilha esta vazia");
        }

        num = (T) array[top];                               //consulta sempre o elemento do topo da pilha
        return num;
    }
//--------------------------------------------------------------------------------------------------------------------------------
    //Função de exibir todos os elementos
    public void show(){
        /*
            exibe todos os elementos da pilha. 
        */
        for(int i = 0; i < size; i++){
            //se o elemento for null, ele não será exibido
            if(array[i] != null){
                System.out.println("Posição ["+i+"] = "+array[i]);
            }
        }
    }
//--------------------------------------------------------------------------------------------------------------------------------
    //Função de verificar se a pilha esta cheia
    boolean full(){
        /*
            se o elemento que esta no topo for igual ao tamanho total da pilha
            então significa que a pilha já esta cheia.
        */ 
        if(top == size-1){
            /*
                size-1 pois se o size for 3, o primeiro elemento
                de um vetor é sempre o 0 dessa forma temos a posições,
                0 1 2, ou seja, não temos a posição 3.
            */
            return true;
        }
        else{
            return false;
        }
    }
//--------------------------------------------------------------------------------------------------------------------------------
    //Função de verificar se a pilha esta vazia
    boolean empy(){
        if(top == -1){
            /*
            se o elemento que esta no topo for igual a -1
            então significa que não existe nenhum elemento na pilha
            logo ela esta vazia.
        */
            return true;
        }
        else{
            return false;
        }
    }
}
