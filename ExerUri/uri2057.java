import java.util.Scanner;
public class uri2057{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int valores[] = {input.nextInt(),input.nextInt(),input.nextInt()};
    int S,T,F;
    S = valores[0];T = valores[1];F = valores[2];
    int fusoH = S+T;
    if (fusoH + F == 24){
      fusoH = 0;
    }else{
      if (fusoH > 24){
        fusoH = (fusoH % 24);
      }else if (fusoH + F < 0){
        fusoH += 24;
      }
      fusoH += F;
    }
    System.out.println(fusoH);
  }
}
