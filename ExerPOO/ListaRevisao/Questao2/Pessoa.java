public class Pessoa{
    
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;

    public Pessoa(){
        this.nome = "";
        this.idade = 0;
        this.altura = 0.0;
        this.peso = 0.0;
        this.sexo = "";
    }

    public Pessoa(String nome,int idade,double altura,double peso,String sexo){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public double imc(){
        return this.peso/(this.altura*this.altura);
    }

    public String toString(){        
        String categoria = "";
        if(this.imc() <= 18.5){
            categoria = "Abaixo do peso normal";
        }else if(this.imc() > 18.5 && this.imc() <= 25){
            categoria = "Peso Normal";            
        }else if(this.imc() > 25 && this.imc() <= 30){
            categoria = "Acima do peso normal";        
        }else{
            categoria = "Obesidade";            
        }        
        return "Nome: "+this.nome+"\nSexo: "+this.sexo+"\nIdade: "+this.idade+"\nPeso: "+this.peso+"\nAltura: "+this.altura+"\nIMC: "+this.imc()+"\nCategoria: "+categoria;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getPeso(){
        return this.peso;
    } 

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
}