import java.util.List;
import java.util.ArrayList;
public class ColecaoDeAlunos implements Selecionavel{

    private List<Aluno> listaAlunos;

    public ColecaoDeAlunos(){
        this.listaAlunos = new ArrayList();
    }

    public void adicionaAluno(Aluno aluno){
        this.listaAlunos.add(aluno);
    }

    public List<Nomeavel> getLista(String pesquisar){
        List<Nomeavel> alunos = new ArrayList();
        for(Aluno aluno:this.listaAlunos){
            if(aluno.getNome().startsWith(pesquisar)){
                alunos.add(aluno);
            }
        }
        return alunos;
    }

    

}