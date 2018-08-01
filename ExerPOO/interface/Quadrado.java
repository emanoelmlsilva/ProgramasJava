public class Quadrado implements AreaCalculavel{
    
    private double lado;
    private String nome;
    
    public Quadrado(String nome,double lado){
        this.nome = nome;
        this.lado = lado;
    }
    
    public double calculaArea(){
        return lado*lado;
    }

    public String getNome(){
        return this.nome;
    }
}