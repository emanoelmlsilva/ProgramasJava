import java.util.Scanner;
public class uri1957{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String[] listaExadecimal = {"A","B","C","D","E","F"};
        String resultado = "";
        String fim = "";
        int decimal = input.nextInt();        
        int resto;                    
        while(decimal != 0){                      
            resto = decimal%16;              
            decimal = decimal/16;              
            if(resto >= 10){                                                
                resultado += listaExadecimal[resto-10];  
            }else{
                resultado += resto;                  
            }                                                                                                                                                                  
        }                
        for(int i = resultado.length()-1;i >= 0;i--){
            fim += resultado.charAt(i);
        }
        System.out.println(fim);
    }
}