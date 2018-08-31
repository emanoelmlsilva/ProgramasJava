public class Fila<Item>{

    private Item[] elementos;
    private int head;
    private int tail;
    private int tamanho;

    public Fila(int capacidade){
        this.elementos = (Item[]) new Object[capacidade];
        this.head = 0;
        this.tail = 0;
        this.tamanho = 0;
    }

    public Fila(){
        this.elementos = (Item[]) new Object[10];
        this.head = 0;   
        this.tail = 0;
        this.tamanho = 0;
    }

    public void push(Item item){//insira um elemento    
        if(this.tamanho == this.elementos.length){
            resize(2*this.elementos.length);
        }               
        this.elementos[this.tail] = item;
        this.tail++;        
        if(this.tail == this.elementos.length){
            this.tail = 0;
        }
        this.tamanho++;
    }

    public Item pop(){//remova um elemento
        //prova 1B = erro ao não diminuir 1 do tamanho da lista
        // Item novo = this.elementos[this.head];        
        // // this.tamanho--;
        // if(this.tamanho == this.elementos.length){
        //     resize(this.elementos.length/2);
        // }
        // this.head++;        
        // if(this.head == this.elementos.length){
        //     this.head = 0;
        // }        
        // return novo;
        Item novoItem = this.elementos[this.head];        
        this.tamanho--;
        if(this.head == this.elementos.length){
            this.head = 0;
        }else{
            this.head++;
        }
        if(this.tamanho == this.elementos.length/4){
            resize(this.elementos.length/2);
        }
        return novoItem;
    }

    public void resize(int capacidade){
        assert capacidade >= this.tamanho;
        Item[] novoItem = (Item[]) new Object[capacidade];
        for(int i = 0;i < this.tamanho;i++){
            novoItem[i] = this.elementos[(head+i)%this.elementos.length];
        }
        this.elementos = novoItem;
        this.head = 0;
        this.tail = this.tamanho;
    }

    public boolean isEmpty(){
        if(this.tail == 0){
            return true;
        }
        return false;
    }   

    public int getTamanho(){
        return this.tamanho;
    }

    public void mostrar(){
        for(int i = head;i <= tamanho;i++){
            System.out.println(elementos[i]);
        }
    }
}