public class Main{
    public static void main(String[]args){
        ColecaoDeAlunos cA = new ColecaoDeAlunos();
        cA.adicionaAluno(new Aluno("Silva manoel"));
        cA.adicionaAluno(new Aluno("joao Jose"));
        cA.adicionaAluno(new Aluno("Silva Maria"));
        ColecaoDeDisciplinas cD = new ColecaoDeDisciplinas();
        cD.adicionaDisciplinas(new Disciplinas("Matematica Elementar"));
        cD.adicionaDisciplinas(new Disciplinas("Matematica Fisica"));
        cD.adicionaDisciplinas(new Disciplinas("Fisica Comportamental"));
        ColecaoDeProfessor cP = new ColecaoDeProfessor();
        cP.adicionaProfessor(new Professor("D Mario"));
        cP.adicionaProfessor(new Professor("M Fabio"));
        cP.adicionaProfessor(new Professor("M Aila"));

        ComponenteDeSelecao cS = new ComponenteDeSelecao();
        cS.geraListBox(cA,"Silva");
        cS.geraListBox(cD,"Matematica");
        cS.geraListBox(cP,"D");
    }
}