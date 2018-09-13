import java.util.Scanner;
public class uri2152{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int quantidade = Integer.parseInt(leitor.nextLine());
        String modi = "";
        String modi2 = "";
        String abriuFechou = "";
        for(int i = 0;i < quantidade;i++){
            String[] entrada = leitor.nextLine().split(" ");            
            if(Integer.parseInt(entrada[0]) < 10){               
                modi = "0"+entrada[0];                    
            }else{                
                modi = entrada[0];
            }

            if(Integer.parseInt(entrada[1]) < 10){                
                modi2 = "0"+entrada[1];                    
            }else{
                modi2 = entrada[1];
            }            
            if(entrada[2].equals("1")){             
                abriuFechou = "abriu!";                
            }else{
                abriuFechou = "fechou!";                
            }

            System.out.printf("%s:%s - A porta %s\n",modi,modi2,abriuFechou);
        }

        
    }
}