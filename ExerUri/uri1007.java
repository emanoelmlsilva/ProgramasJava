import java.util.Scanner;
public class uri1007{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int A,B,C,D,dif;
    A = scan.nextInt();
    B = scan.nextInt();
    C = scan.nextInt();
    D = scan.nextInt();
    dif = (A * B - C * D);
    System.out.printf("DIFERENCA = %d\n",dif);
  }
}
