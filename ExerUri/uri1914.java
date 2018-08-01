import java.util.Scanner;
public class uri1914{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int quantidade = input.nextInt();
        String result = "";
        String[] QT,parImpar;
        input.nextLine();
        for(int i = 0;i < quantidade;i++){            
            QT = input.nextLine().split(" ");
            parImpar = input.nextLine().split(" ");            
            if((Integer.parseInt(parImpar[0]) + Integer.parseInt(parImpar[1]))%2==0){
                if(QT[1].equals("PAR")){
                    result = QT[0];
                }else if(QT[3].equals("PAR")){
                    result = QT[2];
                }
            }else{
                if(QT[1].equals("IMPAR")){
                    result = QT[0];
                }else if(QT[3].equals("IMPAR")){
                    result = QT[2];
                }
            }
            System.out.println(result);
        }
    }
}