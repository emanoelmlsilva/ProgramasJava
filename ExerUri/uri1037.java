import java.util.Scanner;
public class uri1037{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double valor = input.nextDouble();
    int lista[][] = {{0,25},{25,50},{50,75},{75,100}};
    for (int i = 0;i<lista.length;i++){
      if (valor >= lista[i][0] && valor <= lista[i][1] && i == 0){
        System.out.printf("Intervalo [%d,%d]\n",lista[i][0],lista[i][1]);
        break;
      }else if (valor > lista[i][0] && valor <= lista[i][1]){
        System.out.printf("Intervalo (%d,%d]\n",lista[i][0],lista[i][1]);
        break;
      }else{
        if (i == 3){
          System.out.printf("Fora de intervalo\n");
          }
        }
      }
    }
}
