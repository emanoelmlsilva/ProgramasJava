import java.util.Scanner;
public class uri1133{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int x,y,maior,menor;
    x = input.nextInt();y = input.nextInt();
    if (x > y){
      menor = y;
      maior = x;
    }else{
      menor = x;
      maior = y;
    }
    for(int i = ++menor;i < maior;i++){
      if((i % 5 == 2) || (i % 5 == 3)){
        System.out.println(i);
      }
    }
  }
}
