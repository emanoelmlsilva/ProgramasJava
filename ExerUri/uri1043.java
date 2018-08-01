import java.util.Scanner;
public class uri1043{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double perimetro,area;
    double list[] = {input.nextDouble(),input.nextDouble(),input.nextDouble()};
    if (Math.abs(list[1] - list[2]) < list[0] && list[0] < (list[1]+list[2]) ||
          Math.abs(list[0]-list[2]) < list[1] && list[1] < (list[0]+list[2]) ||
          Math.abs(list[0]-list[1]) < list[2] && list[2] < (list[0]+list[1])){
      perimetro = list[0]+list[1]+list[2];
      System.out.printf("Perimetro = %.1f\n",perimetro);
    }else{
      area = ((list[0]+list[1])*list[2])/2;
      System.out.printf("Area = %.1f\n",area);
    }
  }
}
