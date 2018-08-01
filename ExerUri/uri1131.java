import java.util.Scanner;
public class uri1131{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int inter,gremio,repetiçao = 1;
    int interJogos = 0,gremioJogos = 0,empate = 0,contJogos = 0;
    String time;
    while(repetiçao != 2){
      if (repetiçao == 1){
        inter = input.nextInt();gremio = input.nextInt();
        if(inter > gremio){
          interJogos++;
        }else if(gremio > inter){
          gremioJogos++;
        }else{
          empate++;
        }
        contJogos++;
      }
      System.out.println("Novo grenal (1-sim 2-nao)");
      repetiçao = input.nextInt();
    }
    System.out.printf("%d grenais\n",contJogos);
    System.out.printf("Inter:%d\n",interJogos);
    System.out.printf("Gremio:%d\n",gremioJogos);
    System.out.printf("Empates:%d\n",empate);
    if(interJogos > gremioJogos){
      time = "Inter venceu mais";
    }else if(gremioJogos > interJogos){
      time = "Gremio venceu mais";
    }else{
      time = "Nao houve vencedor";
    }
    System.out.printf("%s\n",time);
  }
}
