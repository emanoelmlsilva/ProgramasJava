import java.util.Scanner;
public class uri1080{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int arrays[] = new int[100];
    int maior = arrays[0];int posi = 0;
    for (int i = 0;i < arrays.length;i++){
      arrays[i] = input.nextInt();
      if (arrays[i] > maior){
        maior = arrays[i];
//<<<<<<< HEAD
        posi = (i+1);
//=======
        posi = i;
//>>>>>>> master
      }
    }
    System.out.println(maior);
    System.out.println(posi);
  }
}
