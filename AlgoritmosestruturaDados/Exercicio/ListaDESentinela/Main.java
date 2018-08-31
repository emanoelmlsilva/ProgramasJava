public class Main{
    public static void main(String[]args){
        ListaDESentinela<String> teste = new ListaDESentinela<>();
        teste.addInicio("Emanoel");
        teste.addInicio("Pedro");;
        teste.addInicio("Emerson");
        teste.addFim("joao");
        teste.mostrar();
        System.out.println("========Removerndo");
        teste.removerInicio();
        teste.removerInicio();
       // teste.removerFim();
        teste.mostrar();
    }
}