import java.util.Scanner;
public class uri1142{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int quant,cont,valor = 1;
    quant = input.nextInt();
    for(int i = 0;i < quant;i++){
      cont  = 0;
      while(cont < 3){
        System.out.printf("%d ",valor);
        cont++;
        valor++;
      }
      valor++;
      System.out.print("PUM");
      System.out.println();
    }
  }
}
