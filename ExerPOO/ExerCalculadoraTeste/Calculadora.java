public class Calculadora{

    public int maior(int a,int b){
        return a>b?a:b;        
    }

    public int soma(int[] listaSoma){
        int soma = 0;
        for(int i:listaSoma){
            soma += i;
        }
        return soma;
    }

    public int subtrair(int a,int b){        
        return a - b;
    }

    public double raiz(double r){
        return Math.sqrt(r);
    }

    public double media(double[] listaDouble){
        double soma = 0;
        for(double i:listaDouble){
            soma += i;
        }
        return soma/listaDouble.length;
    }
}