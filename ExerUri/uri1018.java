import java.util.Scanner;
public class uri1018{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int n,r;
    n = input.nextInt();
    System.out.printf("%d\n",n);
    int lista[] = {100,50,20,10,5,2,1};
    for (int i=0;i<lista.length;i++){
      r = n/lista[i];
      n = n%lista[i];
      System.out.printf("%d nota(s) de R$ %d,00\n",r,lista[i]);
      }
  }
}
