public class Poligono extends Pontos{

    private Pontos[] arrayPontos;
    private double area;

    private int posicaoF;

    public Poligono(int tamanho){
        this.area = 0;
        this.posicaoF = 0;
        this.arrayPontos = new Pontos[tamanho];           
        for(int i = 0;i<this.arrayPontos.length;i++){
            this.arrayPontos[i] = new Pontos();
        }                  
    }

    public double calculaArea(){
        double a1 = 0,a2 = 0;
        for(int i = 0;i < this.arrayPontos.length-1;i++){           
            a1 = (this.arrayPontos[i].getPontos()[0]*this.arrayPontos[i+1].getPontos()[1]);
            a2 = (this.arrayPontos[i+1].getPontos()[0]*this.arrayPontos[i].getPontos()[1]);
            this.area += (a1-a2);               
        }        
        return this.area*1/2;
    }

    public void adicionaPontos(Pontos ponto){    
        if(posicaoF < this.arrayPontos.length ) {
            for(int i = 0;i<this.posicaoF;i++){//comparar se exites pontos iquais

            }
            this.arrayPontos[posicaoF] = ponto;
            this.posicaoF++;
        }       
    }

    public void removePontos(int index){    
        if(index < this.posicaoF){            
            for(int i = index;i < this.posicaoF-1;i++){
                this.arrayPontos[i] = this.arrayPontos[i+1];
            }        
            this.posicaoF--;                
        }            
    }

    public String toString(){
        String pontosC = "";                
        for(int i = 0;i < this.posicaoF;i++){            
            pontosC += "cordenadas x"+i+" y"+i+":\n== "+arrayPontos[i]+" ==\n";                                 
        }
        pontosC += "Area: "+this.calculaArea();
        return pontosC;
    }

    public Pontos[] getArrayPontos(){
        return this.arrayPontos;
    }
}