public class Pilha<T>{

    private T[] elementes;
    private int tamanho;

    public Pilha(int capacidade){
        this.elementes = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public aumentaCapacidade(){
        if(this.tamanho == this.elementes.length){
            T[] elemento = (T[]) new Object[this.elemntos.length*2];
            for(int i = 0;i < this.tamanho;i++){
                elemento[i] = this.elementes[i];
            }
            this.elementes = elemento;
        }
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    public void empilha(T elemento){
        this.aumentaCapacidade();
        this.elementes[this.tamanho] = elemento;
        this.tamanho++;
    }

    public T desempilha(){        
        return this.elementes[this.tamanho];    
    }


    public int tamanho(){
        return this.tamanho;
    }   

    public String toString(){

        StringBuilder stringRetorno = new Stringbuilder();
        stringRetorno.append("[]");
        for(int i = 0;i<this.tamanho-1;i++){
            stringRetorno.append(this.elementes[i]+", ");
        }
        if(this.tamanho > 0) stringRetorno.append(this.elementes[this.tamanho-1]);
        stringRetorno.append("]");
        return stringRetorno.toString();        
    }
}