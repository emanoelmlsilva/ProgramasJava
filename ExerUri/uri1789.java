import java.io.*;
public class uri1789{
    public static void main(String[]args) throws IOException{
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));        
        String L;
        String[]V;
        int resut = 0,maior;
        while((L = leitor.readLine()) != null){              
            maior = 0;                  
            V = leitor.readLine().split(" ");
            maior = 0;                                  
            for(int i = 0;i < Integer.parseInt(L);i++){               
                if(Integer.parseInt(V[i]) > maior){
                    maior = Integer.parseInt(V[i]);
                }                       
            }    
            if(maior>= 1 && maior < 10){
                resut = 1;                    
            }else if(maior >= 10 && maior < 20){
                resut = 2;                    
            }else if(maior >= 20){
                resut = 3;                    
            }              
            System.out.println(resut);    
        } 
    }            
}