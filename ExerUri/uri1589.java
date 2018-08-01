import java.util.Scanner;
public class uri1589{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int r1,r2,valor;
        valor = input.nextInt();
        for(int i = 0;i < valor;i++){
            r1 = input.nextInt();
            r2 = input.nextInt();
            int c = r1+r2;
            System.out.println(c);
        }
    }
}