public class Circulo implements FormaGeometrica{    
    
    private double pi = 3.14;
    private double raio;

    public Circulo(double raio){
        this.raio = raio;;
    }

    public double calculaPerimetro(){
        return 2*pi*this.raio;
    }

    public double calculaArea(){
        return pi*(this.raio*this.raio);
    }

    public String toString(){
        return "Raio "+this.raio;
    }
}