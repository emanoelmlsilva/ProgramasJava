import java.util.Scanner;

public class uri1985{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
            double [] produtos = {1.50,2.50,3.50,4.50,5.50};
            int p = input.nextInt();
            double soma = 0;
            for(int i = 0;i < p;i++){
                int [] q = {input.nextInt(),input.nextInt()};
                soma += produtos[(q[0]-1000)-1] * q[1];
            }            
            System.out.printf("%.2f\n",soma);
    }
}   