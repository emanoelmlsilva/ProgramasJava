import java.util.NoSuchElementException;
public class ListaSimples<Item>{

    private No<Item> inicio; 
    private No<Item> ultimo;   
    private int tamanho;

    public ListaSimples(){
        this.inicio = null;   
        this.ultimo = null;     
        this.tamanho = 0;
    }

    public void addInicio(Item item){
        No<Item> novo = new No(item);
        if(isEmpty()){            
            this.inicio = novo;      
            this.ultimo = novo;                  
        }else{
            novo.proximo = this.inicio;
            this.inicio = novo;
        }        
        this.tamanho++;
    }

    public void addFim(Item item){
        No<Item> novo = new No(item);
        if(isEmpty()){            
            this.inicio = novo;
            this.ultimo = novo;                        
        }else{                        
            this.ultimo.proximo = novo;
            this.ultimo = novo;                        
        }        
        this.tamanho++;
    }

    public No buscaItem(Item item){
        No primeiro = this.inicio;        
        for(; primeiro != null;primeiro = primeiro.proximo ){
            if(primeiro.item.equals(item)){
                return primeiro;
            }
        }        
        return null;
    }
    public void removeProximo(Item item){
        No busca = buscaItem(item); 
        if(busca == null || busca.proximo == null){
            throw new NoSuchElementException();
        }else{           
            No remove = busca.proximo;
            busca.proximo = remove.proximo;
            remove.proximo = null;
       }
    }

    public void removeUltimo(){
        No removerNo = this.inicio;
        for(;removerNo.proximo.proximo != null;removerNo = removerNo.proximo);        
        removerNo.proximo = null;
        this.ultimo = removerNo;        
    }
   
    public void imprimirLista(){        
        for(No<Item> x = this.inicio;x != null;x = x.proximo){            
            System.out.println(x.item);
        }
    }
    public boolean isEmpty(){
        return this.inicio == null;
    }
    
    public class No<Item>{

        Item item;
        No proximo;        

        public No(Item item){
            this.item = item;
            this.proximo = null;            
        }
            

    }

}