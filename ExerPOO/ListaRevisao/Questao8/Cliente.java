public class Cliente extends Pessoa{
    
    private int codigo;

    public Cliente(String nome,Data nascimento,int codigo){
        super(nome,nascimento);
        this.codigo = codigo;
    }

    public void imprimeDados(){        
        System.out.printf("Nome: %s\nNascimento: %d/%d/%d\nCodigo: %d\n",super.getNome(),super.getNascimento().getDia(),
        super.getNascimento().getMes(),super.getNascimento().getAno(),this.codigo);
    }
}