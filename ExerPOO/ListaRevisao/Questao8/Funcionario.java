public class Funcionario extends Pessoa{ 

    public float salario;

    public Funcionario(String nome,Data nascimento,float salario){
        super(nome,nascimento);
        this.salario = salario;
    }

    public float calculaImposto(){
        return this.salario*0.03f;
    }

    public void imprimeDados(){
        System.out.printf("Nome: %s\nNascimento: %d/%d/%d\nSalario: %.2f\nImposto: %.2f\n",super.getNome(),super.getNascimento().getDia(),
        super.getNascimento().getMes(),super.getNascimento().getAno(),this.salario,this.calculaImposto());
    }
    public float getSalario(){
        return this.salario;
    }

    public void setSalario(float salario){
        this.salario = salario; 
    }
}