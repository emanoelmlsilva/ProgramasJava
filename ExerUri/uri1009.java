import java.util.Scanner;
public class uri1009{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String nome = input.next();
    double salarioF = input.nextDouble();
    double vendasM = input.nextDouble();
    double total = vendasM * 0.15 + salarioF;
    System.out.printf("TOTAL = R$ %.2f\n",total);
  }
}
