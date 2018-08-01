import java.util.Scanner;
public class uri1866{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int C = input.nextInt();
        int s;
        for(int i = 0;i < C;i++){
            int N = input.nextInt();
            s = 1;
            for(int j = 1;j < N;j+=3){                
                s -= 1 ;                  
                s += 1;                                                             
            }   
            System.out.println(s);         
        }
        input.close();
    }
}