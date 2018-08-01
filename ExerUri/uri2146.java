import java.io.*;
public class uri2146{
    public static void main(String[]args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));        
        String numero;
        int resultado;
        while((numero = input.readLine()) != null){
            resultado = Integer.parseInt(numero)-1;          
            System.out.println(resultado);
        }
    }
}