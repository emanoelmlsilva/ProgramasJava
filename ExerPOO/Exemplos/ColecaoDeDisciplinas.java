import java.util.List;
import java.util.ArrayList;
public class ColecaoDeDisciplinas implements Selecionavel{

    private List<Disciplinas> listaDisciplinas;

    public ColecaoDeDisciplinas(){
        this.listaDisciplinas = new ArrayList();
    }

    public void adicionaDisciplinas(Disciplinas disciplina){
        this.listaDisciplinas.add(disciplina);
    }

    public List<Nomeavel> getLista(String pesquisar){
        List<Nomeavel> disciplinas = new ArrayList();
        for(Disciplinas disciplina:this.listaDisciplinas){
            if(disciplina.getNome().startsWith(pesquisar)){
                disciplinas.add(disciplina);
            }
        }
        return disciplinas;
    }

}