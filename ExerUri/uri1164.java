import java.util.Scanner;
public class uri1164{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int quantidade,valor,soma;
    quantidade = input.nextInt();
    for (int i = 0;i < quantidade;i++){
      soma = 0;
      valor = input.nextInt();
      for(int j = 1;j < valor;j++){
        if(valor % j == 0){
            soma += j;
        }
      }
      if(soma == valor){
        System.out.printf("%d eh perfeito\n",valor);
      }else{
        System.out.printf("%d nao eh perfeito\n",valor);
      }
    }
  }
}
