import java.util.Scanner;
public class uri1181{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        double[][] matriz = new double[12][12];
        double soma = 0,media;
        int linha = leitor.nextInt();  
        leitor.nextLine();      
        String opçao = leitor.nextLine();        
        for(int i = 0;i < matriz.length;i++){
            for(int j = 0;j < matriz[i].length;j++){
                matriz[i][j] = leitor.nextDouble();
                if(i == linha){
                    soma += matriz[i][j];
                }                
            }
        }
        if(opçao.equals("S")){
            System.out.printf("%.1f\n",soma);
        }else if(opçao.equals("M")){
            media = soma/12;
            System.out.printf("%.1f\n",media);
        }
        
    }
}