import java.util.Scanner;
public class uri1158{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int n,x,y,parada = 0,paradaImpar,soma;
    n = input.nextInt();
    while(parada < n){
      paradaImpar = 0;
      x = input.nextInt();
      y = input.nextInt();
      soma = 0;
      while(paradaImpar < y){
        if(x % 2 != 0){
          soma += x;
          paradaImpar++;
        }
        x++;
      }
      System.out.println(soma);
      parada++;
    }
    input.close();
  }
}
