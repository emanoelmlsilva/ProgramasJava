public class Pilha<Item>{

    private Item[] elementos;
    private int tamanho;

    public Pilha(int capacidade){
        this.elementos = (Item[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Pilha(){
        this(10);
    }

    public boolean isEmpty(){
        if(this.tamanho == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return this.tamanho;
    }

    public void push(Item item){//adicionar Item na pilha
        if(this.tamanho == this.elementos.length){
            this.resize(2*this.elementos.length);
        }
        this.elementos[this.tamanho] = item;
        this.tamanho++;        
    }

    public Item pop(){//remove Item da pilha      
        Item item = this.elementos[this.tamanho-1];
        this.elementos[this.tamanho-1] = null;
        this.tamanho--;
        if(this.tamanho == this.elementos.length/4){            
            this.resize(this.elementos.length/2);
        }          
        return item;
    }

    public void resize(int maxCapacity){//redimensiona o tamanho da pilha
        Item[] novo = (Item[]) new Object[maxCapacity];
        for(int i = 0;i < this.tamanho;i++){
            novo[i] = this.elementos[i];
        }
        this.elementos = novo;
    }
}