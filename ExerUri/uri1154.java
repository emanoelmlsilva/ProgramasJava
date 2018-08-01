import java.util.Scanner;
public class uri1154{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int idade,cont = 0,soma = 0;
    double media;
    idade = input.nextInt();
    while(idade >= 0){
      soma+=idade;
      cont++;
      idade = input.nextInt();
    }
    media = ((double) soma)/cont;
    System.out.printf("%.2f\n",media);
  }
}
