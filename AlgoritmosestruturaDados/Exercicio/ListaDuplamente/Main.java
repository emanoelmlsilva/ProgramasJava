public class Main{
    public static void main(String[]args){
        ListaDuplamente<String> teste = new ListaDuplamente<>();
        teste.addInicio("Madonna");
        teste.addInicio("pedro");
        teste.addFim("Madonna");
        teste.addInicio("emerson");
        teste.addInicio("Madonna");
        teste.addInicio("Madonna");
        teste.addFim("Madonna");
      //  teste.mostrar();
        System.out.println("quantidade de Madonna "+teste.madonnaCount());
        // System.out.println("==============removido Inicio===========");
        // teste.removerInicio();
        // teste.mostrar();
        // System.out.println("==============removido Fim===========");
        // teste.removerFim();
        // teste.mostrar();
        

    }
}