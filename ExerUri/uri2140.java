import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class uri2140{
    public static void main(String[]args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] duasNotas;
        int[] notasdisponiveis = {2,5,10,20,50,100};
        int[] resultadoDispo = new int[6];
        int compra,pago,troco,cont;
        boolean posiImpo = false;
        while(true){
            cont = 0;
            posiImpo = false;
            duasNotas = input.readLine().split(" ");
            compra = Integer.parseInt(duasNotas[0]);
            pago = Integer.parseInt(duasNotas[1]);
            troco = pago - compra;
            if(compra == pago && compra == 0){
                break;
            }
            for(int dispo:notasdisponiveis){        
                resultadoDispo[cont] = troco/dispo;  
                cont++;              
            }            
            for(int i = 0;i < notasdisponiveis.length;i++){
                if(resultadoDispo[i] > 0){
                    for(int j = 0;j < notasdisponiveis.length;j++){
                        if((notasdisponiveis[i] + notasdisponiveis[j]) == troco){
                            posiImpo = true;                        
                            break;                   
                        }
                    }
                }
                if(posiImpo){                  
                    break;
                }
            }
            if(posiImpo){
                System.out.println("possible");                
            }else{
                System.out.println("impossible");
            }             
        }
    }
}