import java.lang.reflect.Array;
public class Lista<T>{//vetor/array configura tipo dinamicamente (<>) generics 
    
    private T[] elementos; //array de String(atributo)
    private int tamanho;

    public Lista(int capacidade){//construtor
        this.elementos = (T[]) new Object[capacidade];//instanciado o vetor com tamanho a definir
        this.tamanho = 0;
    }

    public Lista(int capacidade,Class<T> tipoClasse){//construtor
        this.elementos = (T[]) Array.newInstance(tipoClasse,capacidade);//instanciado o vetor dinamicamente
        this.tamanho = 0;
    }


    //metodos   

    public boolean adiciona(T elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false; 
    } 

    public void adiciona(int posicao,T elemento){// adiciona elemento em qualquer posicao
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
   
    public void remove(T elemento){
        int posicao = this.busca(elemento); 
        if(posicao >= 0){
            this.remove(posicao);                    
        }        
    }

    public void limpar(){
        // Opção 1
       this.elementos = (T[]) new Object[this.elementos.length];
       this.tamanho = 0;
    //     // Opção 2    
    //    this.tamanho = 0;
    //     // Opção 3
    //    for(int i = 0;i < this.tamanho;i++){
    //        this.elementos[i] = null;
    //    }
    //    this.tamanho = 0;
    }

    //aumentando capacidade do array
    private void aumentaCapacidade(){        
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for(int i = 0;i < this.elementos.length;i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

     public T busca(int posicao){//busca elemento pelo indice passado do array
        if(!(posicao >= 0 && posicao < this.tamanho)) throw new IllegalArgumentException("posição inválida");
        return this.elementos[posicao];
     }    

    public int busca(T elemento){//retorna o indece do elemento no array;
        for(int i = 0;i < this.tamanho;i++){
            if(this.elementos[i].equals(elemento)) return i;
        }
        return -1;
     }
    
    public T obtem(int posicao){
        return this.busca(posicao);
    }

    public boolean contem(T elemento){
        return this.busca(elemento) >= 0;
    }    

    public int ultimoIndece(T elemento){        
        for(int i = this.tamanho-1;i>=0;i--){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

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