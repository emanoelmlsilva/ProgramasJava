import java.util.Scanner;
public class uri1186{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        String O = leitor.nextLine();
        double[][] matriz = new double[12][12];
        double soma = 0,media;
        int cont = 0,diag;
        for(int i = 0;i < matriz.length;i++){
            diag = matriz.length-(i+1);
            for(int j = 0;j < matriz[i].length;j++){
                matriz[i][j] = leitor.nextDouble();
                if(j > diag){
                    cont++;
                    soma += matriz[i][j];
                }                
            }
        }
        if("S".equals(O)){
            System.out.printf("%.1f\n",soma);
        }else if("M".equals(O)){
            media = soma/cont;
            System.out.printf("%.1f\n",media);
        }
    leitor.close();
    }
}