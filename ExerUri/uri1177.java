import java.util.Scanner;
public class uri1177{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        int quantidade = leitor.nextInt();
        int array1000[] = new int[1000];
        int cont = 0;
        for(int i = 0;i<array1000.length;i++){
            if(cont == quantidade){
                cont = 0;
            }
            array1000[i] = cont++;                   
        }
        for(int i = 0;i<array1000.length;i++){
            System.out.printf("N[%d] = %d\n",i,array1000[i]);
        }
        leitor.close();
    }
}