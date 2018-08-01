import java.util.Scanner;
public class uri1073{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int valor = input.nextInt();double raiz;
    for (int i = 2;i <= valor;i+=2){
      raiz = Math.pow(i,2);
      System.out.printf("%d^2 = %.0f\n",i,raiz);
      }
    }
  }
