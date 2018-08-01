import java.util.Scanner;
public class uri1052{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String[] meses = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    int valor = input.nextInt();
    System.out.println(meses[--valor]);
  }
}
