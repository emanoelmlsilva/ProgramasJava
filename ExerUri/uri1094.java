import java.util.Scanner;
public class uri1094{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int valor = input.nextInt();int coelho = 0;int rato = 0;int sapo = 0;int total;
    float total_C_parcent ;float total_R_parcent;float total_S_parcent;
    input.nextLine();
    String[][] arrays = new String[valor][valor];
    for (int i = 0;i < arrays.length;i++){
      arrays[i] = input.nextLine().split(" ");
    }
    for (int j = 0;j < arrays.length;j++){
      if(arrays[j][1].equals("C")){
        coelho += Integer.parseInt(arrays[j][0]);
      }else if(arrays[j][1].equals("R")){
        rato += Integer.parseInt(arrays[j][0]);
      }else if(arrays[j][1].equals("S")){
        sapo += Integer.parseInt(arrays[j][0]);;
      }
    }
    total = (coelho+rato+sapo);
    total_C_parcent = (float)((coelho * 100.00) /total);
		total_R_parcent = (float)((rato * 100.00) /total);
    total_S_parcent = (float)((sapo * 100.00) /total);
    System.out.printf("Total: %d cobaias\n",total);
    System.out.printf("Total de coelhos: %d\n",coelho);
    System.out.printf("Total de ratos: %d\n",rato);
    System.out.printf("Total de sapos: %d\n",sapo);
    System.out.printf("Percentual de coelhos: %.2f %%\n",total_C_parcent);
    System.out.printf("Percentual de ratos: %.2f %%\n",total_R_parcent);
    System.out.printf("Percentual de sapos: %.2f %%\n",total_S_parcent);

  }
}
