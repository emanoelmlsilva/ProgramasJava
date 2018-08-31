public class Lista2<Item> extends EstruturaEstatica<Item>{

    public Lista2(){
        super();
    }

    public Lista2(int capacidade){
        super(capacidade);
    }

    public boolean adiciona(Item elemento){
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao,Item elemento){
        return super.adiciona(posicao, elemento);
    }

    public void remove(int posicao){//remove elemento do array
        super.remove(posicao);
    }

    public Item busca(int posicao){//busca elemento pelo indice passado do array
        if(!(posicao >= 0 && posicao < super.tamanho())) throw new IllegalArgumentException("posição inválida");
        return super.elementos[posicao];
     }    

    public int busca(Item elemento){//retorna o indece do elemento no array;
        for(int i = 0;i < super.tamanho;i++){
            if(super.elementos[i].equals(elemento)) return i;
        }
        return -1;
     }
}