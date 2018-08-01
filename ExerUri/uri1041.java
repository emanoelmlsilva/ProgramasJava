import java.util.Scanner;
public class uri1041{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double x,y;
    String[] entrada = input.nextLine().split(" ");
    x = Double.parseDouble(entrada[0]);
    y = Double.parseDouble(entrada[1]);
    if (x > 0 && y > 0){
      System.out.println("Q1");
    }else if (x < 0 && y > 0){
      System.out.println("Q2");
    }else if (x < 0 && y < 0){
      System.out.println("Q3");
    }else if (x > 0 && y < 0){
      System.out.println("Q4");
    }else if (x == 0 && y != 0){
      System.out.println("Eixo Y");
    }else if (x != 0 && y == 0){
      System.out.println("Eixo X");
    }else{
      System.out.println("Origem");
    }
  }
}
