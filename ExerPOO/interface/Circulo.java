public class Circulo implements AreaCalculavel{

    private double raio;
    private double pi;
    private String nome;

    public Circulo(String nome,double raio){
        this.nome = nome;
        this.raio = raio;
        this.pi = 3.15;
    }

    public double calculaArea(){
        return pi*(raio*raio);
    }

    public String getNome(){
        return this.nome;
    }
}