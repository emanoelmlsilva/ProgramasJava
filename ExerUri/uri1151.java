import java.util.Scanner;
public class uri1151{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int fib = input.nextInt();
    int t1 = 0,t2 = 1,t3 = 0;
    System.out.printf("%d %d",t1,t2);
    for (int i = 2;i<fib;i++){
      t3 = t1+t2;
      System.out.print(" "+t3);
      t1 = t2;
      t2 = t3;
    }
    System.out.println();
    input.close();
  }
}
