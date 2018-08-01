public class Main{
    public static void main(String[]args){        
        CadastroPessoas cp = new CadastroPessoas();
        Cliente c1 = new Cliente("Emanoel",new Data(23,12,1997),118);
        Cliente c2 = new Cliente("usename",new Data(02,05,1995),119);
        Cliente c3 = new Cliente("usename2",new Data(03,02,1996),120);
        Funcionario f1 = new Funcionario("Emanoel",new Data(23,12,1997),15000);
        Funcionario f2 = new Funcionario("usename",new Data(02,05,1995),2000);
        Funcionario f3 = new Funcionario("usename2",new Data(03,11,1999),1000);
        Gerente g1 = new Gerente("Emanoel",new Data(23,12,1997),15000,"TI");
        Gerente g2 = new Gerente("usename",new Data(02,05,1995),2000,"Carpinteiro");
        Gerente g3 = new Gerente("usename2",new Data(03,11,1999),1000,"Engenheiro");
        cp.cadastraPessoa(c1);
        cp.cadastraPessoa(c2);
        cp.cadastraPessoa(c3);
        cp.cadastraPessoa(f1);
        cp.cadastraPessoa(f2);
        cp.cadastraPessoa(f3);
        cp.cadastraPessoa(g1);
        cp.cadastraPessoa(g2);
        cp.cadastraPessoa(g3);
        cp.imprimeCadastro();
    }
}