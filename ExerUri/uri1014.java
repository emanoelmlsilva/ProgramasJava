import java.util.Scanner;
public class uri1014{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    double y,v;
    y = input.nextDouble();
    v = x/y;
    System.out.printf("%.3f km/l\n",v);
  }
}
