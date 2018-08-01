import java.util.Scanner;
public class uri1078{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int tab = input.nextInt();
    for (int i = 1;i <= 10;i++){
      System.out.printf("%d x %d = %d\n",i,tab,(tab*i));
    }
  }
}
