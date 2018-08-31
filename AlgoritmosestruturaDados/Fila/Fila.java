import java.util.NoSuchElementException;
import java.util.Iterator;

public class Fila<Item>{

    Item[] elementos;
    int head;
    int tail;
    int tamanho;//ent

    public Fila(int capacidade){
        elementos = (Item[]) new Object[capacidade];
        head = 0;
        tail = 0;
        tamanho = 0;
    }

    public boolean cheia(){
        if(this.tamanho == this.elementos.length){
            return true;
        }
        return false;
    }

    public int size(){
        return this.tamanho;
    }

    public void redimensiona(int maximaCapacidade){
        assert maximaCapacidade >= this.tamanho;
        Item[] novaFila = (Item[]) new Object[maximaCapacidade];
        for(int i = 0;i < this.tamanho;i++){
            novaFila[i] = this.elementos[(head + i) % this.elementos.length];
        }
        this.elementos = novaFila;
        this.head = 0;
        this.tail = this.tamanho;
    }

    public Item desinfileirar(){//dequeue
        Item itemRemovido = this.elementos[this.head];
        this.tamanho--;
        if(this.head == this.elementos.length){
            this.head = 0;
        }else{
            this.head++;
        }
        if(this.tamanho == this.elementos.length/4){
            redimensiona(this.elementos.length/2);
        }  
        return itemRemovido;  
        // OU
        // if(this.cheia()) throw new NoSuchElementException("Queue underflow");
        // Item item = this.elementos[this.head];
        // this.elementos[this.head] = null;
        // this.tamanho--;
        // this.head++;
        // if(this.head == this.elementos.length) this.head = 0;
        // //encolher array se necessario
        // if(this.tamanho > 0 && this.tamanho == this.elementos.length/4) redimensiona(this.elementos.length/2);
        // return item;
    }

    public void enfileirar(Item itemI){//queue        
        if(this.tail == this.elementos.length){
            this.tail = 0;
        }else{
            this.tail++;
        }
        this.elementos[this.tail] = itemI;
        this.tamanho++;
        if(cheia()){
            redimensiona(2*this.elementos.length);
        }

        // OU
        // if(this.tamanho == this.elementos.length) redimensiona(2*this.elementos.length);
        // this.elementos[tail++] = itemI;
        // if(this.tail == this.elementos.length) this.tail = 0;
        // this.tamanho++;
    }

    public Item peek(){
        if(cheia()){
            throw new NoSuchElementException("Queue underflow");
        }
        return this.elementos[this.head];
    }

    public Iterator<Item> iterator(){
        return new ArrayIterator();
    }    
public class ArrayIterator implements Iterator<Item>{

    private int i = 0;

    public boolean hasNext(){
        return i < tamanho;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }

    public Item next(){
        if (!hasNext()) throw new NoSuchElementException();
        Item item = elementos[(i + head) % elementos.length];
        i++;
        return item;
    }
}
}