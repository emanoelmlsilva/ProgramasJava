public class ListaDuplamente<Item>{

    private No inicio;
    private No fim;    
    private int tamanho;

    public ListaDuplamente(){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void addInicio(Item item){
        No novo = new No(item);
        if(isEmpty()){            
            this.inicio = novo;
            this.fim = novo;        
        }else{
            this.inicio.anterio = novo;
            novo.proximo = this.inicio;
            this.inicio = novo;            
        }
        // this.inicio.anterio = this.fim;
        // this.fim.proximo = this.inicio;
        this.tamanho++;
    }

    public void addFim(Item item){
        No novo = new No(item);
        if(isEmpty()){            
            this.inicio = novo;
            this.fim = novo;            
        }else{
            this.fim.proximo = novo;
            novo.anterio = this.fim;
            this.fim = novo;          
        }
        // this.inicio.anterio = this.fim;
        // this.fim.proximo = this.inicio;
        this.tamanho++;
    }

    public void removerInicio(){   
        if(this.tamanho == 1){
            this.inicio = null;
            this.fim = null;
        }else{
            this.inicio = this.inicio.proximo;                
            this.inicio.anterio = this.fim;
            this.fim.proximo = this.inicio;         
        }
        this.tamanho--;
    }

    public void removerFim(){
        if(this.tamanho == 1){
            this.inicio = null;
            this.fim = null;
        }else{
            this.fim = this.fim.anterio;        
            this.inicio.anterio = this.fim;
            this.fim.proximo = this.inicio;
        }
        this.tamanho--;
    }

    public Item ItemMeio(){
        No<Item> partindoInicio = this.inicio;
        No<Item> partindoFim = this.fim;
        if(this.tamanho % 2 != 0){    
            for(;partindoInicio != partindoFim;partindoInicio = partindoInicio.proximo , partindoFim = partindoFim.anterio);            
        }else{
            for(;partindoInicio.proximo != partindoFim && partindoFim.anterio != partindoInicio;partindoInicio = partindoInicio.proximo , partindoFim = partindoFim.anterio);                
        }        
        if(partindoInicio != null){
            return partindoInicio.item;   
        }                                          
        return null;           
    }
    
    public void mostrar(){
        No in = this.inicio;
        if(this.tamanho > 0){
            do{
                System.out.println(in.item);
                in = in.proximo;
            }while(in != this.fim);        
        }else{
            System.out.println("lista vazia");
        }
    }
    //prova 2 A para dar certo a lista duplamente encadeada não pode ser circular
    // public int madonnaCount(){
    //     int cont = 0;
    //     if(tamanho > 0){  
    //         for(No x = this.inicio;x != null;x = x.proximo){
    //             if(x.item.equals("Madonna")){
    //                 cont++;
    //             }
    //         }               
    //     }else{
    //         System.out.println("Lista Vazia");
    //     }    
    //     System.out.println(cont);
    //     return cont;    
    // }
    
    public boolean isEmpty(){
        return this.inicio == null;
    }
    public int getTamanho(){
        return this.tamanho;
    }

    public class No<Item>{

        private No proximo;
        private No anterio;
        private Item item;

        public No(Item item){
            this.proximo = null;
            this.anterio = null;
            this.item = item;
        }
        
    }
}