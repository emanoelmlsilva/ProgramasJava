public class Main{
    public static void main(String[]args){

        Calculadora calc = new Calculadora();        

        if(calc.maior(10,20) == 20){
            System.out.println("10 > 20 = True");
        }else{
            System.out.println("10 > 20 = False");
        }

        if(calc.soma(new int[] {10,20}) == 30){
            System.out.println("10 + 20 = 30 -True");
        }else{
            System.out.println("10 + 20 = 30 -False");
        }


        if(calc.subtrair(10,20) == -10){
            System.out.println("10 - 20 = -10 -True");
        }else{
            System.out.println("10 - 20 = -10 -False");
        }

        if(calc.raiz(25) == 5){
            System.out.println("Raiz(25) = 5 -True");
        }else{
            System.out.println("Raiz(25) = 5 -False");
        }

        if(calc.media(new double[] {10,20}) == 15) {
            System.out.println("media 10 + 20 = 15 -True");
        }else{
            System.out.println("media 10 + 20 = 15 -False");
        }

        
    }
}