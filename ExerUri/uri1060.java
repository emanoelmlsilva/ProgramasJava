import java.util.Scanner;
public class uri1060{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int cont = 0;
    for (int i = 0;i < 6;i++){
      if (input.nextDouble() > 0){
        cont++;
      }
    }
    System.out.printf("%d valores positivos\n",cont);
  }
}
