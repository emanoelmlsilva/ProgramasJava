public class Retangulos extends Quadrilateros{        

    public Retangulos(double base,double altura){
        super(base,altura);        
    }

    public double calculaArea(){                
        return 2*(super.getLado1() + super.getLado2());
    }
    
    public String toString(){
        return "base "+super.getLado1()+" altura "+super.getLado2();
    }
}