import java.util.Scanner;
public class uri1973{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        long carneiroNRoubado = 0,estrelaAtacadas = 0;        
        long quantidadeEstrela = input.nextLong();
        input.nextLine();
        String[] carneiroEstrela = input.nextLine().split(" "); 
        long intermediario = 0;    
        boolean voltar = false;
        int i = 0;
        while((i >= 0) && (i < quantidadeEstrela)){ 
            if(Long.parseLong(carneiroEstrela[i]) > 0){                                                               
                intermediario = Long.parseLong(carneiroEstrela[i]);                   
                carneiroEstrela[i] =  Long.toString(intermediario-1);                                                                                           
                if(voltar == false){
                    estrelaAtacadas++;                    
                }
                }                                      
            if(intermediario % 2 == 0){                
                voltar = true;
            }         
            if(voltar){
                i--;
            }else{                
                i++;
            }                                                                     
        }        
        for(int j = 0;j < quantidadeEstrela;j++){                       
            if(Long.parseLong(carneiroEstrela[j]) > 0){           
                carneiroNRoubado += Long.parseLong(carneiroEstrela[j]);                     
            }
        }   
        System.out.printf("%d %d\n",estrelaAtacadas,carneiroNRoubado);
    }
}