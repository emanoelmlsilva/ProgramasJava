import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class uri1101{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    List<Integer> lista = new ArrayList<Integer>();
    //ArrayList<Integer> valoresLista = new ArrayList<Integer>();
    int soma;int m;int n = -1;
    while (n != 0){
      soma = 0;
      m = input.nextInt();
      n = input.nextInt();
      if (n > 0){
        //valoresLista.add(m,n);
        for(int i = n;i <= m;i++){
          soma += i;
        }
        lista.add(soma);
      }
    }
    for(int i = 0;i < lista.size();i++){
      System.out.println(lista.get(i));
    }
    System.exit(0);
  }
}
