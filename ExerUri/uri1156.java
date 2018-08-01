public class uri1156{
  public static void main(String[]args){
    double i = 3,j = 2,s = 1;
    while (i <= 39){
      s += i/j;
      i+=2;
      j+=j;
    }
    System.out.printf("%.2f\n",s);
  }
}
