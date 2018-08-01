public class ComponenteDeSelecao{

    public void geraListBox(Selecionavel selec,String nome){
        for(Nomeavel n:selec.getLista(nome)){
            System.out.println(n.getNome());
        }
    }
}