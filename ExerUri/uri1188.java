import java.util.Scanner;
public class uri1188{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        double[][] matriz = new double[12][12];
        double soma = 0,media;
        int cont = 0,j1 = 5,j2 = 6;                                            
        String opçao = leitor.nextLine();        
        for(int i = 0;i < matriz.length;i++){                  
            for(int j = 0;j < matriz[i].length;j++){
                matriz[i][j] = leitor.nextDouble();                                
            }
        }                
        for(int i = 7;i < matriz.length;i++){        
            for(int j = j1;j <= 5;j++){                
                soma += matriz[i][j];
                cont++;
            }
            for(int k = 6;k <= j2;k++){
                soma += matriz[i][k];
                cont++;
            }
            j1--;
            j2++;
        }
        if(opçao.equals("S")){
            System.out.printf("%.1f\n",soma);
        }else if(opçao.equals("M")){
            media = soma/cont;
            System.out.printf("%.1f\n",media);
        }
        
    }
}