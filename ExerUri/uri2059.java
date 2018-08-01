import java.util.Scanner;
public class uri2059{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int p,j1,j2,r,a;
        p = input.nextInt();
        j1 = input.nextInt();
        j2 = input.nextInt();
        r = input.nextInt();
        a = input.nextInt();
        String resposta = "";               
        int soma = j1+j2;
        if((r != a) || (p == 1 && (soma % 2 == 0 || p == 0 && soma % 2 != 0) && r == 0 && a == 0)){
            resposta = "Jogador 1 ganha!";
        }else{
            resposta = "Jogador 2 ganha!";
        }            
        System.out.println(resposta);    
    }
}