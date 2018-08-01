import java.util.Scanner;
public class uri1149{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int a,n,soma,cont = 0;
    a = input.nextInt();
    n = input.nextInt();
    while(n <= 0){
      n = input.nextInt();
    }
    soma = a;
    while(cont < n-1){
      soma += ++a;
      cont++;
    }
    System.out.println(soma);
  }
}
