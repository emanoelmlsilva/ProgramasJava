import java.util.Scanner;
import java.util.Arrays;
public class uri1071{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int x,y,maior,menor,soma = 0;
    x = input.nextInt();y = input.nextInt();
    int lista[] = {x,y};Arrays.sort(lista);
    if (x != y){
      maior = lista[1];
      menor = lista[0];
        for (int i = --maior;i > menor;i--){
          if (i % 2 != 0){
            soma+=i;
          }
        }
      }
    System.out.println(soma);
  }
}
