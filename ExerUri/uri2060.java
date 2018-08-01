import java.util.Scanner;
public class uri2060{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int mult2 = 0,mult3 = 0,mult4 = 0,mult5 = 0;
        int[] multiplos = new int[4];
        int[] arrayM = {2,3,4,5};
        for (int i = 0;i < n;i++){
            int l = input.nextInt();
            if(l % 2 == 0){
                multiplos[0] = ++mult2;
            }
            if(l % 3 == 0){
                multiplos[1] = ++mult3;
            }
            if(l % 4 == 0){
                multiplos[2] = ++mult4;
            }
            if(l % 5 == 0){
                multiplos[3] = ++mult5;
            }
        }        
        for(int i = 0;i < multiplos.length;i++){
            System.out.printf("%d Multiplo(s) de %d\n",multiplos[i],arrayM[i]);
        }        
    }
}