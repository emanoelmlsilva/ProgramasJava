import java.util.Scanner;
public class uri1065{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int cont = 0;
    for (int i = 0;i < 5;i++){
      if (input.nextInt() % 2 == 0){
        cont++;
      }
    }
    System.out.printf("%d valores pares\n",cont);
  }
}
