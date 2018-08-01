import java.util.Scanner;
public class uri1035{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String[] entrada = input.nextLine().split(" ");
    int a,b,c,d;
    a = Integer.parseInt(entrada[0]);
    b = Integer.parseInt(entrada[1]);
    c = Integer.parseInt(entrada[2]);
    d = Integer.parseInt(entrada[3]);
    if (b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a % 2 == 0){
      System.out.println("Valores aceitos");
    }else{
      System.out.println("Valores nao aceitos");
    }
  }
}
