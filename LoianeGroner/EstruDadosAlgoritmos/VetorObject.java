public class VetorObject{
    private Object[] elementos; //array de String(atributo)
    private int tamanho;

    public VetorObject(int capacidade){//construtor
        this.elementos = new Object[capacidade];//instanciado o vetor com tamanho a definir
        this.tamanho = 0;
    }

    //metodos   

    public boolean adiciona(Object elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false; 
    } 

    public void adiciona(int posicao,Object elemento){// adiciona elemento em qualquer posicao
        if(!(posicao >= 0 && posicao < this.tamanho)) throw new IllegalArgumentException("posição inválida");
        
        this.aumentaCapacidade();

        //movendo todos os elementos
        for(int i = this.tamanho-1;i >= posicao;i--){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;        
    }

    public void remove(int posicao){//remove elemento do array
        if(!(posicao >= 0 && posicao < this.tamanho)) throw new IllegalArgumentException("posição inválida");

        for(int i = posicao;i < this.tamanho-1;i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    //aumentando capacidade do array
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            Object[] elementosNovos = new Object[this.elementos.length*2];
            for(int i = 0;i < this.elementos.length;i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

     public Object busca(int posicao){//busca elemento pelo indice passado do array
        if(!(posicao >= 0 && posicao < this.tamanho)) throw new IllegalArgumentException("posição inválida");
        return this.elementos[posicao];
     }    

    public int busca(Object elemento){//retorna o indece do elemento no array;
        for(int i = 0;i < this.tamanho;i++){
            if(this.elementos[i].equals(elemento)) return i;
        }
        return -1;
     }

    //  public boolean busca(Object elemento){//retorna o indece do elemento no array;
    //     for(int i = 0;i < this.tamanho;i++){
    //         if(this.elementos[i].equals(elemento)) return true;
    //     }
    //     return false;
    //  }

    public int tamanho(){//monstra o tamanho do array
        return this.tamanho;
    }

     public String toString(){//mostra o que esta no array

        //return Arrays.toString(elementos); 1 metodo

        // String s = "["; //nao é um jeito pratico 2 metodo
        
        // for(int i = 0;i < this.tamanho-1;i++){
        //     s += this.elementos[i];
        //     s += ", ";
        // }

        // if(this.tamanho > 0) s += this.elementos[tamanho-1];                    

        // s += "]"; 

        // e metodo utilizando a classe StringBuilder

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