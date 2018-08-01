import java.util.Scanner;
public class uri1117{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int cont = 0;
    double nota,media,soma = 0;
    while(cont < 2){
      nota = input.nextDouble();
      if(nota >= 0 && nota <= 10){
        soma += nota;
        cont++;
      }else{
        System.out.println("nota invalida");
      }
    }
    media = (double) soma/cont;
    System.out.printf("media = %.2f\n",media);
  }
}
