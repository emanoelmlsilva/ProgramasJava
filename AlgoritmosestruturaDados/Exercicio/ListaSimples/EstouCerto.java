import java.util.Scanner;
public class EstouCerto{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        ListaSimples<String> lista = new ListaSimples();
        lista.addInicio("Emanoel");
        lista.addInicio("Pedro");
        lista.addFim("Emerson");
        lista.imprimirLista();
        System.out.println("=================");
        // lista.removeProximo("Pedro");
        lista.removeUltimo();
        lista.imprimirLista();
        
    }
}