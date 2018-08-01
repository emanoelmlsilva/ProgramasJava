import java.util.Scanner;
public class uri1046{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int horas[] = {input.nextInt(),input.nextInt()};
    int result;
    if (horas[0] > horas[1]){
      result = (horas[1] + 24) - horas[0];
    }else if (horas[0] < horas[1]){
      result = horas[1] - horas[0];
    }else{
      result = 24;
    }
    System.out.printf("O JOGO DUROU %d HORA(S)\n",result);
  }
}
