import java.util.Scanner;
public class uri1930{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int t1,t2,t3,t4;
        t1 = input.nextInt();
        t2 = input.nextInt();
        t3 = input.nextInt();
        t4 = input.nextInt();
        int soma = (t1+t2+t3+t4) - 3;
        System.out.println(soma);
    }
}