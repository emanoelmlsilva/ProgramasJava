public class Gerente extends Funcionario{

    private String area;
    
    public Gerente(String nome,Data nascimento,float salario,String area){
        super(nome,nascimento,salario);
        this.area = area;
    }

    public float calculaImposto(){
        return this.salario*0.05f;
    }

    public void imprimeDados(){        
        System.out.printf("Nome: %s\nNascimento: %d/%d/%d\nSalario: %.2f\nArea: %s\n",super.getNome(),super.getNascimento().getDia(),
        super.getNascimento().getMes(),super.getNascimento().getAno(),super.getSalario(),this.area);
    }
    public String getArea(){
        return this.area;
    }

    public void setArea(String area){
        this.area = area;
    }
}