public class ListaDESentinela<Item>{

    private No sentinela;    
    private int tamanho;


    public ListaDESentinela(){
        this.sentinela = new No();
        this.sentinela.proximo = this.sentinela;
        this.sentinela.anterio = this.sentinela;        
        this.tamanho = 0;
    }

    public void addInicio(Item item){
        No novo = new No(item);
        if(isEmpty()){            
            this.sentinela.proximo = novo;
            this.sentinela.anterio = novo;            
        }else{                      
            novo.proximo = this.sentinela.proximo;
            this.sentinela.proximo.anterio = novo;            
            this.sentinela.proximo = novo;
            novo.anterio = this.sentinela;                           

        }
        this.tamanho++;
    }

    public void addFim(Item item){
        No novo = new No(item);
        if(isEmpty()){        
            this.sentinela.proximo = novo;
            this.sentinela.anterio = novo;
        }else{
            this.sentinela.anterio.proximo = novo;
            novo.anterio = this.sentinela.anterio;
            novo.proximo = this.sentinela;
            this.sentinela.anterio = novo;            
        }
        this.tamanho++;
    }

    public void mostrar(){
        No<Item> mover = this.sentinela.proximo;
        for(;mover != this.sentinela;mover = mover.proximo) {           
                System.out.println(mover.item);                                        
        }
        
    }

    public void removerInicio(){
        this.sentinela.proximo = this.sentinela.proximo.proximo;
        this.sentinela.proximo.anterio = this.sentinela;
    }

    public void removerFim(){
        this.sentinela.anterio = this.sentinela.anterio.anterio;
        this.sentinela.anterio.proximo = this.sentinela;
    }

    public boolean isEmpty(){
        return this.tamanho == 0;
    }

    public int size(){
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

        public No(){
            this.proximo = null;
            this.anterio = null;
            this.item = null;
        }
    }
}