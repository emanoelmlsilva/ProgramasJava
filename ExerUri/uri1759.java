import java.util.Scanner;
public class uri1759{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int quantidadeHO = input.nextInt();
        for(int i = 0;i < quantidadeHO;i++){            
            if(i == quantidadeHO-1){
                System.out.println("Ho!");
            }else if(i < quantidadeHO){
                System.out.print("Ho ");
            }
        }
        input.close();
    }
}