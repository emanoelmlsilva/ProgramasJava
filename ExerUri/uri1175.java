import java.util.Scanner;
public class uri1175{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int[] array = new int[20];
    for(int i = 0;i < array.length;i++){
      array[i] = input.nextInt();
    }
    int aux;
    for(int i = 0,j = (array.length-1);i < (array.length/2);i++,j--){
      aux = array[i];
      array[i] = array[j];
      array[j] = aux;
    }
    for(int i = 0;i < array.length;i++){
      System.out.printf("N[%d] = %d\n",i,array[i]);
    }
  }
}
