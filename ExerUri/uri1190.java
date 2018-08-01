import java.util.Scanner;
public class uri1190{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double[][] matriz = new double[12][12];
        String O = input.nextLine();
        double soma = 0,tot = 0,cont = 11;
        double media;    
        int diag;
        for(int i = 0;i < matriz.length;i++){
            diag = matriz.length-(i+1);
            for(int j = 0;j < matriz[i].length;j++){                
                matriz[i][j] = input.nextDouble();
                if(j > diag && j >= 7 && i <= 5){       
                    soma += matriz[i][j];
                    tot++;
                }            
                if(j > i && i > 5 && i != 11 && j > 6){                   
                   soma += matriz[i][j];                  
                   tot++;
                }
            }
            if(i > 5){
                cont--;
            }            
        }
        if("S".equals(O)){
            System.out.printf("%.1f\n",soma);
        }else if("M".equals(O)){
            media = soma/tot;
            System.out.printf("%.1f\n",media);
        }
    }
}