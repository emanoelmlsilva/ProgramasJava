import java.util.Scanner;
public class uri1179{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int contP = 0;
        int contI = 0;
        int valores = 15;
        int valor;
        for(int i = 0;i < valores;i++){
            valor = leitor.nextInt();
            if(valor % 2 == 0){
                par[contP] = valor;
                contP++;
            }else{
                impar[contI] = valor;
                contI++;
            }
            if(contP == par.length){
                contP = 0;
                for(int j = 0;j < par.length;j++){
                    System.out.printf("par[%d] = %d\n",j,par[j]);
                }
            }else if(contI == impar.length){
                contI = 0;
                for(int j = 0;j < par.length;j++){
                    System.out.printf("impar[%d] = %d\n",j,impar[j]);
                }
            }
        }        
        for(int j = 0;j < contI;j++){
            System.out.printf("impar[%d] = %d\n",j,impar[j]);
        }            
        for(int j = 0;j < contP;j++){
            System.out.printf("par[%d] = %d\n",j,par[j]);
        }                       
    }
}