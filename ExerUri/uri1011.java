import java.util.Scanner;
public class uri1011{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double r = input.nextDouble();
    double pi = 3.14159;
    double v = (4/3.0) * pi * (r*r*r);
    System.out.printf("VOLUME = %.3f\n",v);
  }
}
