import java.util.Scanner;

public class uri1435{
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);
        int quantidade = leitor.nextInt();
        int array[][] = new int[quantidade][quantidade];
        int inicio = 0;
        int soma = 1;
        int cont = 0;        
            for(int i = 0; i < quantidade;i++){            
                for(int j = i; j < i+1;j++){                       
                    array[i][j] = soma;                                               
                    System.out.printf("i%d = j%d ",i,j);                    
                }               
                System.out.println();                   
            }        
        for(int i = 0; i < quantidade;i++){            
            for(int j = 0; j < quantidade;j++){                
                System.out.print(array[i][j]);      
            }   
            System.out.println();                                                 
        }
    }
}