import java.util.Scanner;
public class uri1134{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int n = 0;
    int alcool = 0,gasolina = 0,diesel = 0;
    while(n != 4){
      n = input.nextInt();
      if (n == 1){
        alcool++;
      }else if (n == 2){
        gasolina++;
      }else if (n == 3){
        diesel++;
      }
    }
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: "+alcool);
    System.out.println("Gasolina: "+gasolina);
    System.out.println("Diesel: "+diesel);
    input.close();
  }
}
