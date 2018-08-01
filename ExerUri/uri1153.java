import java.util.Scanner;
public class uri1153{
  public static void main(String[]args){
    int x,n,soma = 1;
    n = new Scanner(System.in).nextInt();
    x = n;
    for(int i = 1;i <= n;i++){
      soma += (n-i) * soma;
    }
    System.out.println(soma);
  }
}
