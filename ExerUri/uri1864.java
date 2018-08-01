import java.util.Scanner;

public class uri1864 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        String texto = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        System.out.println(texto.substring(0,input.nextInt()));

        input.close();
    }
}