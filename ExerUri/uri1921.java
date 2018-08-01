import java.util.Scanner;
public class uri1921{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);               
        int n = input.nextInt();
        double r = n*(((double)n-3)/2);
        System.out.printf("%.0f\n",r);
    }
}