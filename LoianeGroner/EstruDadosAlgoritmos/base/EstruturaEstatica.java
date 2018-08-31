public class EstruturaEstatica<Item>{
    
    public Item[] elementos;
    public int tamanho;

    public EstruturaEstatica(int capacidade){
        this.elementos = (Item[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        super(10);
    }

    protected boolean adiciona(Item elemento){//adiciona o elemento no indece vazio
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false; 
    } 

    protected boolean adiciona(int posicao,Item elemento){// adiciona elemento em qualquer posicao
        if(!(posicao >= 0 && posicao < this.tamanho)) throw new IllegalArgumentException("posição inválida");
        
        this.aumentaCapacidade();

        //movendo todos os elementos ate chegar no desejado
        for(int i = this.tamanho-1;i >= posicao;i--){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;     
        return true;   
    }

    public void remove(int posicao){//remove elemento do array pelo indece
        if(!(posicao >= 0 && posicao < this.tamanho)) throw new IllegalArgumentException("posição inválida");

        for(int i = posicao;i < this.tamanho-1;i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    private void aumentaCapacidade(){        
        if(this.tamanho == this.elementos.length){
            Item[] elementosNovos = (Item[]) new Object[this.elementos.length*2];
            for(int i = 0;i < this.elementos.length;i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho(){//monstra o tamanho do array
        return this.tamanho;
    }

     public String toString(){//mostra o que esta no array
    
        StringBuilder s = new StringBuilder();
        
        s.append("[");
        
        for(int i = 0;i < this.tamanho-1;i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0) s.append(this.elementos[tamanho-1]);

        s.append("]");

        return s.toString();

     }
}