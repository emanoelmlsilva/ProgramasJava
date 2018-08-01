import java.util.List;
import java.util.ArrayList;
public class CadastroPessoas{
    private List<Pessoa> pessoas;

    public CadastroPessoas(){
        pessoas = new ArrayList<Pessoa>();
    }

    public void cadastraPessoa(Pessoa pess){
        this.pessoas.add(pess);
    }

    public void imprimeCadastro(){
        for(Pessoa pessoa:this.pessoas){
            pessoa.imprimeDados();
        }        
    }
}