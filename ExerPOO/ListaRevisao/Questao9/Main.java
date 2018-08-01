public class Main{
    public static void main(String[]args){
        FormaGeometrica[] fL = new FormaGeometrica[6];
        fL[0] = new Retangulos(2,5);
        fL[1]= new Retangulos(3,7);
        fL[2] = new Quadrados(4);
        fL[3] = new Quadrados(8);
        fL[4] = new Circulo(3);
        fL[5] = new Circulo(4);
        for(FormaGeometrica f:fL){
            System.out.println(f.toString());            
            System.out.println(f.calculaPerimetro());
            System.out.println(f.calculaArea());
        }
        
    }
}