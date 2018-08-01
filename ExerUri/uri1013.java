import java.util.Scanner;
import java.util.Arrays;
public class uri1013{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String[] entrada = input.nextLine().split(" ");
    int a,b,c,maior;
    a = Integer.parseInt(entrada[0]);
    b = Integer.parseInt(entrada[1]);
    c = Integer.parseInt(entrada[2]);
    int lista[] = {a,b,c};
    Arrays.sort(lista);
    maior = lista[2];
    System.out.printf("%d eh o maior",maior);
  }
}
