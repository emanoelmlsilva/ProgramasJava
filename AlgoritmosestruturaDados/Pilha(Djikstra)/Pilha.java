import java.util.Iterator;
import java.util.NoSuchElementException;

public class Pilha<Item>{
    
    Item[] elementos;
    int tamanho;

    public Pilha(int capacidade){
        this.elementos = (Item[]) new Object[capacidade];
        this.tamanho = 0;        
    }

    public Pilha(){
        this.elementos = (Item[]) new Object[2];
        this.tamanho = 0;
    }

    public boolean vazio(){//verifica se o tamanho da lista esta iqual a 0
        return this.tamanho == 0;
        // OU
        // if(this.tamanho == 0){
        //     return true;
        // }
        // return false;

    }

    public void push(Item add){//adiciona um elemento a minha lista    
        if(this.tamanho == this.elementos.length) redimensiona(2*this.elementos.length);    
        // OU
        // if(this.tamanho == (this.elementos.length - 1)){
        //     redimensiona(2*this.elementos.length);
        // }                                
        this.elementos[this.tamanho] = add;           
        this.tamanho++;
    }

    public Item pop(){//remove um elemento da minha lista
        if(vazio()){           
            return null;
        }else{                                                    
            this.tamanho--; 
            Item novoItem = this.elementos[this.tamanho];              
            if(this.tamanho > 0 && this.tamanho == this.elementos.length/4){
                redimensiona(this.elementos.length/2);
            }            
            return novoItem;
            //OU
            // if(vazio()) throw new NoSuchElementException("stack underflow");
            // Item item = this.elementos[this.tamanho-1];
            // this.elementos[this.tamanho-1] = null;
            // this.tamanho--;
            // //encolher a lista se necessario 
            // if(this.tamanho > 0 && this.tamanho == this.elementos.length/4) redimensiona(this.elementos.length/2) return item;
        }
    }

    public void redimensiona(int maxCapacidade){//aumenta o tamanho do array de elementos
        assert maxCapacidade >= this.tamanho;//se a capacidade for iqual ou menor nao redimenciona o array
        Item[] novaLista = (Item[]) new Object[maxCapacidade];
        for(int i = 0;i < this.tamanho;i++){
            novaLista[i] = elementos[i];
        }
        this.elementos = novaLista;        
    }
    
    public Item get(int index){
        if(index >= 0 && index < this.tamanho){                                     
            return this.elementos[index];                                    
        }
            throw new IllegalArgumentException("posição inválida");   
    }

    public int size(){
        return this.tamanho;
    }

    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }

public class ReverseArrayIterator implements Iterator<Item>{
        
    private int i;
    
    public ReverseArrayIterator(){
        i = tamanho-1;
    }

    public boolean hasNext(){
        return i >= 0;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }

    public Item next(){
        if(!hasNext()) throw new NoSuchElementException();
        return elementos[i--];
    }
}
}