import java.io.*;
public class uri2028{
    public static void main(String[]args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int cont,caso = 1,n;
        String nS,lista;                
        while((nS = input.readLine()) != null){            
            n = Integer.parseInt(nS);
            lista = "";
            cont = 1; 
            for(int i = 0;i <= n;i++){                                                                        
                lista += i+" ";
                for(int j = 0;j < i;j++){      
                    if(j > 0){
                        lista += i+" ";                    
                    }      
                    if(i == n && j == i-2){
                        lista += i;
                        cont+=2;
                        break;
                    }                          
                    cont++;
                }                                   
            }                             
            if(cont < 2){
                System.out.printf("Caso %d: %d numero\n",caso,cont);                                         
            }else{
                System.out.printf("Caso %d: %d numeros\n",caso,cont);                                         
            }
            System.out.printf("%s\n\n",lista);                          
            caso++;
        }    
        input.close();                    
    }
}
