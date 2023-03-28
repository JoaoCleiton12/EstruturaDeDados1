
public class MyQueue<T> {
    int size;                                           //Tamanho máximod a fila
    int first;                                          //Começo da fila
    int last;                                           //Fim da fila

    private Object[] array;

    public MyQueue(int size){
        this.size = size;
        first = -1;
        last = -1;
        this.array = new Object[size];
    }



//--------------------------------------------------------------------------------------------------------------------------------
    public void add(T num){
        int lastemp = (last+1) % size;

        /*
            se o final for igual ao começo significa que estou tentando
            sobrescrever o primeiro elemento, dessa forma não existe mais espaço 
            no fim da fila, isso significa que a fila esta cheia.
        */
        if(lastemp == first){
            System.out.println("A fila está cheia");
        }

        last = lastemp;
        array[last] = num;

        /*
            Por padrão o valor do first é -1, se não alteramos para 0,
            ou seja para o primeiro elemnto da fila, o if que testa se a fila esta cheia não ira funcionar.
        */
        if(first == -1){
            first = 0;
        }
    }



//--------------------------------------------------------------------------------------------------------------------------------
    public T remove(){
        T num;

        
        return num;
    }
}
