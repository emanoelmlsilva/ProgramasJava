import java.util.List;
import java.util.ArrayList;
public class ColecaoDeProfessor implements Selecionavel{

    private List<Professor> listaProfessor;

    public ColecaoDeProfessor(){
        this.listaProfessor = new ArrayList();
    }

    public void adicionaProfessor(Professor professor){
        this.listaProfessor.add(professor);
    }

    public List<Nomeavel> getLista(String pesquisar){
        List<Nomeavel> professores = new ArrayList();
        for(Professor professor:this.listaProfessor){
            if(professor.getNome().startsWith(pesquisar)){
                professores.add(professor);
            }
        }
        return professores;
    }

}