import java.util.Scanner;
public class uri1021{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    double valor = input.nextDouble();
    valor += 0.001f;
    double resul;
    int lista[] = {100,50,20,10,5,2};
    double lista2[] = {1,0.50,0.25,0.10,0.05,0.01};
    System.out.println("NOTAS:");
    for (int i = 0;i<lista.length;i++){
      resul = (int)(valor)/lista[i];
      valor = valor%lista[i];
      System.out.printf("%.0f nota(s) de R$ %d.00\n",resul,lista[i]);
    }
    System.out.println("MOEDAS:");
    for (int j = 0;j<lista2.length;j++){
      resul = Math.floor(valor/lista2[j]);
      valor = valor%lista2[j];
      System.out.printf("%.0f moeda(s) de R$ %.2f\n",resul,lista2[j]);
    }


}
}
