import java.io.*;
public class uri2139{
    public static void main(String[]args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String mesD;
        int mesi,dia,totalM = 12,diasFaltando;
        int[] diaCal = {31,29,31,30,31,30,31,31,30,31,30,31};
        while((mesD = input.readLine()) != null){     
            String[] mesDia = mesD.split(" ");       
            diasFaltando = 0;            
            dia = Integer.parseInt(mesDia[1]);
            mesi = Integer.parseInt(mesDia[0]);
            for(int i = mesi; i <= totalM;i++){                              
                for(int j = dia;j <= diaCal[i-1];j++){                                        
                    if(i == 12 && j >= 25){
                        if(j >= 26){
                            diasFaltando = -1;
                        }
                        break;
                    }else{
                        ++diasFaltando;
                    }                                               
                }
                dia = 1;                
            }
            if(diasFaltando == 1){
                System.out.println("E vespera de natal!");
            }else if(diasFaltando == -1){
                System.out.println("Ja passou!");
            }else if(diasFaltando == 0){
                System.out.println("E natal!");
            }else{
                System.out.printf("Faltam %d dias para o natal!\n",diasFaltando);
            }            
        }
    }
}