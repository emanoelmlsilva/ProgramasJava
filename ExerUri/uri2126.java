import java.io.*;
public class uri2126{
    public static void main(String[]args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String n1, n2[],resultado = "";
        int tamanhoN1 = 0,tamanhoN2 = 0,inicC,qtd,caso = 0,pos = 0;        
        while((n1 = input.readLine()) != null){                                                          
            inicC = 0;qtd = 0;caso++;                     
            n2 = input.readLine().split("");
            tamanhoN2 = n2.length;
            tamanhoN1 = n1.length();           
            for(int i = 0;i < (tamanhoN2);i++){                                              
                resultado = "";      
                inicC = i;            
                if((i+tamanhoN1) <= tamanhoN2){
                    for(int j = inicC;j < (i+tamanhoN1);j++){                           
                        resultado += n2[j];                         
                    }      
                }
                if(resultado.equals(n1)){                        
                    pos = i; 
                    qtd++;
                }                                                                
            }   
            if(qtd > 0){         
                System.out.printf("Caso #%d:\nQtd.Subsequencias: %d\nPos: %d\n",caso,qtd,pos+1);                    
            }else{                             
                System.out.printf("Caso #%d:\nNao existe subsequencia\n",caso);
            }
            System.out.println();
        }    
        input.close();    
    }
}