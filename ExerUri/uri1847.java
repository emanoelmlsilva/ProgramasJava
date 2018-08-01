import java.util.Scanner;
public class uri1847{
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        int t1,t2,t3;
        String carinha = "";
        t1 = leitor.nextInt();
        t2 = leitor.nextInt();
        t3 = leitor.nextInt();   
        if( (t1 > t2 && (t2 < t3 || t2 == t3)) ||
         (t1 < t2 && t2 < t3 && (t3 - t2) >= (t2 - t1)) ||
         (t1 > t2 && t2 > t3 && ((t3 - t2) > (t2 - t1))) ||
         (t1 == t2 && t2 < t3)) {
             carinha = ":)";
         }else{
             carinha = ":(";
         }          
        System.out.println(carinha);
        leitor.close();

    }
}