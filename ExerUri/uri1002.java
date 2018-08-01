import java.util.Scanner;
public class uri1002{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double raio,area,pi;
    pi = 3.14159;
    raio = input.nextDouble();
    area = pi*(raio*raio);
    System.out.printf("A=%.4f\n",area);
  }
}
