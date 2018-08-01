public class Pontos{
    
    private int[] pontos;

    public Pontos(){
        this.pontos = new int[2];
    }
    
    public Pontos(int x,int y){
        this.pontos = new int []{x,y};
    }
    // public int[] acessaCordenada(){                
    //     return this.pontos;        
    // }
    
    // public void modificaCoordenada(Pontos coordenada){
    //     this.pontos[0] = coordenada.getPontos()[0];
    //     this.pontos[1] = coordenada.getPontos()[1];    
    // }

    public boolean equals(Pontos ponto){
        if(this.pontos[0] == ponto.getPontos()[0] && this.pontos[1] == ponto.getPontos()[1]) return true;

        return false;
    }

    public String toString(){        
        return "x "+this.pontos[0]+" y "+this.pontos[1];        
    }

    public int[] getPontos(){        
        return this.pontos;
    }

    public void setPontos(int[] pontos){
        this.pontos = pontos;        
    }
}