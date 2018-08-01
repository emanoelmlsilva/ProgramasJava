public class uri1098{
  public static void main(String[]args){
    double i = 0;double j;int k;
    while(i <= 2){
      j = 1;
      k = 0;
      j += i;
      while(k < 3){
        if (j % 2 == 0){
          System.out.printf("I=%.0f J=%.0f\n",i,j);
        }else if (i % 2 == 0){
          System.out.printf("I=%.0f J=%.0f\n",i,j);
        }else if ((i == Math.floor(i)) || (j == Math.floor(j))){
          System.out.printf("I=%.0f J=%.0f\n",i,j);
        }else{
          System.out.printf("I=%.1f J=%.1f\n",i,j);
        }
        j += 1;
        k += 1;
      }
      i+=0.2;
    }
  }
}
