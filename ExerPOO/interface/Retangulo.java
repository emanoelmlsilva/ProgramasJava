public class Retangulo implements AreaCalculavel{

    private double base;
    private double altura;
    private String nome;

    public Retangulo(String nome,double base,double altura){
        this.nome = nome;
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea(){
        return base*altura;
    }

    public String getNome(){
        return this.nome;
    }
}