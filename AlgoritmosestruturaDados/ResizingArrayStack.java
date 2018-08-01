import java.util.Iterator;
import java.util.NoSuchElementException;

public class ResizingArrayStack<Item> implements Iterator<Item>{
    private Item[] a;// pilha
    private int N;// tamanho da pilha

    public ResizingArrayStack(){ //inicializa uma pilha vazia
        a = (Item[]) new Object[2];
        N = 0;
    }

    public boolean isEmpty(){// retorna verdadeiro se a pilha estiver vazia
        return N == 0;
    }

    public int size(){ //retorna o tamanho da pilha
        return N;
    }

    private void resize(int capacity){//redimendiona a pilha
        assert capacity >= N;//testa a validação da pilha se a capacidade dela for menor que o tamanho retorna uma exceção(false)
        Item[] temp = (Item[]) new Object[capacity];// cira uma nova pilha com mais capacidade
        for(int i = 0;i < N;i++){
            temp[i] = a[i];// adiciona os valores da pilha original na criada nova 
        }
        a = temp;//a original fica sendo agora a pilha criada nova
    }

    public void push(Item item){//se necessario redimenciona e insere um item
        if(N == a.length) resize(2*a.length);
        a[N++] = item;
    }

    public Item pop(){
        if(isEmpty()) throw new NoSuchElementException("stack underflow");//pilha estourada
        Item item = a[N-1];//pega o ultimo valor da pilha e atribui a item
        a[N-1] = null;//retira o ultimo valor da pilha e no lugar adiciona o null
        N--;//retira o indece do tamanho da pilha
        //shrink size of array if necessary / encolher o tamanho do array se necessario
        if(N > 0  && N == a.length/4) resize(a.length/2);
        return item;
    }

    public Iterator<Item> iterator(){//nao sei o que faz
        return new ReverseArrayIterator();
    }    

    //Continua na classe aninhada do slide
    
}