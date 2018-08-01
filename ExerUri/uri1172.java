import java.util.Scanner;
public class uri1172{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int vetor[] = new int[10];
    for (int i = 0;i < vetor.length;i++){
      int numero = input.nextInt();
        vetor[i] = numero;
      }
    for (int i = 0;i < vetor.length;i++){
      if (vetor[i] <= 0){
        vetor[i] = 1;
      }
      System.out.printf("X[%d] = %d\n",i,vetor[i]);
    }
  }
}
