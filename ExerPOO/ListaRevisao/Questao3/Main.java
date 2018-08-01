public class Main{
    public static void main(String[]args){    
        Poligono poli = new Poligono(6);
        Pontos p = new Pontos();

        poli.adicionaPontos(new Pontos(-3,-2)); 
        poli.adicionaPontos(new Pontos(-1,4));
        poli.adicionaPontos(new Pontos(6,1)); 
        poli.adicionaPontos(new Pontos(3,10)); 
        poli.adicionaPontos(new Pontos(-4,9));
        poli.adicionaPontos(new Pontos(-3,-2));

        System.out.println("modificado");    
        System.out.println(poli);          
                
        System.out.println("apagando");
        poli.removePontos(4);
        System.out.println(poli);  

        System.out.println("adicionaPontos");
        poli.adicionaPontos(new Pontos(0,0));
        System.out.println(poli);

    }
}