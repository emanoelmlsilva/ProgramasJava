import java.util.Scanner;
public class uri1145{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int x,y,cont = 0;
    x  = input.nextInt();y = input.nextInt();
    for(int i = 0;i < y;i++){
      if(cont < x-1){
        System.out.print(i+1 +" ");
        cont++;
      }else{
        cont = 0;
        System.out.println(i+1);
      }
    }
  }
}
