public class Main{
    public static void main(String[]args){        
        Pessoa pessoa = new Pessoa("Emanoel",20,1.85,74,"Masculino");        
        pessoa.imc();
        System.out.println(pessoa.toString());
    }
}