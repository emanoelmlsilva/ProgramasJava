public class Quadrados extends Quadrilateros{

    public Quadrados(double lado){
        super(lado);
    }

    public double calculaArea(){
        return super.getLado1() * super.getLado1();
    }

    public String toString(){
        return "lado "+super.getLado1();
    }
}