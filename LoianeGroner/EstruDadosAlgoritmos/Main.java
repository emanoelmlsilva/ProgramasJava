import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        //VetorObject vetor = new VetorObject(10);
        Lista<String> vetor = new Lista<String>(2);
        vetor.adiciona("A");
        vetor.adiciona("B");                
        vetor.adiciona("C");
        System.out.println(vetor);
        vetor.limpar();        
        System.out.println(vetor);    
        vetor.adiciona("A");    
        System.out.println(vetor);
        //System.out.println(vetor.contem("C"));
        // vetor.remove(1);

        // System.out.println(vetor);
        
        // vetor.adiciona(5);

        // System.out.println(vetor);
    }
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("|=========================Utilizando Vetor=========================|");
    //     System.out.println("|------------------------by Emanoel Medeiros-----------------------|\n");
    //     String valor = input("Informe o tamanho do Array: ",input);
    //     Vetor vetor = new Vetor(Integer.parseInt(valor));
    //     try{
    //         vetor.adiciona("elemento1");
    //         vetor.adiciona("elemento2");
    //         vetor.adiciona("elemento3");
    //     }catch (Exception E){
    //         E.printStackTrace();
    //     }        
    //     System.out.println(vetor.tamanho());
    //     System.out.println(vetor.toString());
    //     System.out.println(vetor.busca(0));
    //     System.out.println(vetor.busca("Elemento2"));
    // }

    // public static String input(String texto,Scanner input){
    //     System.out.println(texto);
    //     return input.nextLine();
        
    // }
}
