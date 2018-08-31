public class Pilha<Item>{

    private Item[] elementos;
    private int tamanho;

    public Pilha(int capacidade){
        this.elementos = (Item[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Pilha(){
        this.elementos = (Item[]) new Object[10];
        this.tamanho = 0;
    }

    public void push(Item item){//insira um elemento 
        if(this.tamanho == this.elementos.length){//redimensiona se necessario
            this.resize(2*this.elementos.length);       
        }        
        this.elementos[this.tamanho] = item;
        this.tamanho++;
    }    

    public Item pop(){//remova um elemento              
        Item novoItem = this.elementos[this.tamanho-1];
        this.elementos[this.tamanho-1] = null;
        this.tamanho--;
        if(this.tamanho == this.elementos.length/4){//redimensiona se necessario
            this.resize(this.elementos.length/2);
        }  
        return novoItem;
    }

    public void resize(int capacidade){//redimensionar
        assert capacidade >= this.tamanho;        
        Item[] novoItem = (Item[]) new Object[capacidade];
        for(int i = 0;i < this.tamanho;i++){
            novoItem[i] = this.elementos[i];
        }
        this.elementos = novoItem;
    }

    public int size(){
        return this.tamanho;
    }
    
    
    


}