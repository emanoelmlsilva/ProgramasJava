import java.util.Scanner;
public class uri1074{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int i = 0;
    while(i<N){
      int valor = input.nextInt();
      if (valor % 2 == 0 && valor > 0){
        System.out.println("EVEN POSITIVE");
      }else if (valor % 2 == 0 && valor < 0){
        System.out.println("EVEN NEGATIVE");
      }else if (valor % 2 != 0 && valor > 0){
        System.out.println("ODD POSITIVE");
      }else if (valor % 2 != 0 && valor < 0){
        System.out.println("ODD NEGATIVE");
      }else{
        System.out.printf("NULL\n");
      }
      i++;
    }
    input.close();
}
}
