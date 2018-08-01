import java.util.Scanner;
public class uri1044{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int multiplos[] = {input.nextInt(),input.nextInt()};
    if ((multiplos[0] % multiplos[1] == 0) || (multiplos[1] % multiplos[0] == 0)){
      System.out.println("Sao Multiplos");
    }else{
      System.out.println("Nao sao Multiplos");
    }
  }
}
