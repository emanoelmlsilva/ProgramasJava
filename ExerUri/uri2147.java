import java.io.*;
public class uri2147{
    public static void main(String[]args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        String numero;
        int cont = 0;
        while(cont < t){
            numero = input.readLine();
            System.out.printf("%.2f\n",numero.length()*0.01f);
            cont++;
        }
    }
}