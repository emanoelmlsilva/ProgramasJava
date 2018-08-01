import java.util.Scanner;
public class uri1962{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        for(int i = 0;i < n;i++){
            long t = input.nextLong();
            long cal = 2015-t; 
            if(cal > 0){
                System.out.printf("%d D.C.\n",cal++);
            }else{
                System.out.printf("%d A.C.\n",Math.abs(cal)+1);
            }
        }
    }
}